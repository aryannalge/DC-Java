import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket sc = new ServerSocket(5000);

        System.out.println("Server started on port 5000");

        while (true) {
            Socket s = sc.accept();

            new Thread(() -> handle(s)).start();
        }
    }

    static void handle(Socket s) {
        try {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(s.getInputStream())
            );

            PrintWriter out = new PrintWriter(
                s.getOutputStream(), true
            );

            String msg;

            while ((msg = in.readLine()) != null) {
                System.out.println("Client: " + msg);

                out.println("Echo: " + msg);
            }

            s.close();

        } catch (Exception e) {
            System.out.println("Client disconnected");
        }
    }
}