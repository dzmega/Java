package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class User implements Runnable {
    private final Server server;
    private final Socket socket;
    private final BufferedReader reader;
    private final PrintWriter writer;

    public User(Server server, Socket socket) throws IOException {
        this.server = server;
        this.socket = socket;
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer = new PrintWriter(socket.getOutputStream());
    }

    public void sendMessage(String message)
    {
        writer.write("Server: " + message + '\n');
        writer.flush();
    }


    @Override
    public void run() {
        while(!socket.isClosed())
        {
            String msg;
            try {
                if((msg = reader.readLine()) != null)
                {
                    server.sendBroadcast(msg);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
