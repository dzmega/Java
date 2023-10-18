package Chat;

import javafx.application.Platform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable{
    private final ChatController controller;
    private final String username;
    private final PrintWriter writer;
    private final BufferedReader reader;
    private final Socket socket;

    public Client(ChatController controller, String username) throws IOException {
        this.controller = controller;
        this.username = username;
        socket = new Socket("localhost",5555);
        writer = new PrintWriter(socket.getOutputStream());
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        new Thread(this).start();
        sendConnected();
    }

    public void sendMessage(String message)
    {
        message = message + " :)";
        writer.write(username + ": " + message + '\n');
        writer.flush();
    }

    private void sendConnected()
    {
        writer.write("//" + username + " hat sich verbunden" + '\n');
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
                    Platform.runLater(() -> controller.update(buffer));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
