package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

public class Server implements Runnable{

    private final ServerSocket socket;
    private final ArrayList<User> users;

    public Server(int port) throws IOException {
        socket = new ServerSocket();
        users = new ArrayList<>();
        new Thread(this).start();
    }

    public void sendBroadcast(String message)
    {
        users.forEach(user -> user.sendMessage(message));
    }

    @Override
    public void run() {
        while(!socket.isClosed())
        {
            try {
                Socket in = socket.accept();
                users.add(new User(this,in));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
