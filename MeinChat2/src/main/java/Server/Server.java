package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server implements Runnable{

    private final ServerSocket socket;
    private final ArrayList<User>users;

    public Server(int port) throws IOException {
        socket = new ServerSocket(port);
        users = new ArrayList<User>();
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
            Socket in;
            try {
                in = socket.accept();
                users.add(new User(this,in));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
