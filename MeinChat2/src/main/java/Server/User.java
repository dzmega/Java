package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class User implements Runnable{
    private final Server server;
    private final Socket socket;
    private final PrintWriter writer;
    private final BufferedReader reader;

    public User(Server server, Socket socket) throws IOException {
        this.server = server;
        this.socket = socket;
        writer = new PrintWriter(socket.getOutputStream());
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        new Thread(this).start();
    }

    public void sendMessage(String message) {
        writer.write(message + '\n');
        writer.flush();
    }

    @Override
    public void run() {
        while(!socket.isClosed())
        {
            String buffer;
            try {
                if((buffer = reader.readLine()) != null)
                {
                    server.sendBroadcast(buffer);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
