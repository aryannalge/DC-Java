import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 5000);

        BufferedReader key = new BufferedReader(
            new InputStreamReader(System.in)
        );

        BufferedReader in = new BufferedReader(
            new InputStreamReader(s.getInputStream())
        );

        PrintWriter out = new PrintWriter(
            s.getOutputStream(), true
        );

        System.out.print("Enter message: ");
        String msg = key.readLine();

        out.println(msg);

        System.out.println("Server: " + in.readLine());

        s.close();
    }
}