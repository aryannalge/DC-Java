import java.io.*;
import java.net.*;

public class RPCClient {
    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 6000);

        BufferedReader key = new BufferedReader(
            new InputStreamReader(System.in)
        );

        BufferedReader in = new BufferedReader(
            new InputStreamReader(s.getInputStream())
        );

        PrintWriter out = new PrintWriter(
            s.getOutputStream(), true
        );

        System.out.print("You: ");

        out.println(key.readLine());

        System.out.println(in.readLine());

        s.close();
    }
}