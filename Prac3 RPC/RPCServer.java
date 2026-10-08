import java.io.*;
import java.net.*;

public class RPCServer {

    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(6000);

        System.out.println("RPC Server started");

        Socket s = ss.accept();

        BufferedReader in = new BufferedReader(
            new InputStreamReader(s.getInputStream())
        );

        PrintWriter out = new PrintWriter(
            s.getOutputStream(), true
        );

        String msg = in.readLine();

        System.out.println("Client: " + msg);

        out.println("Server received: " + msg);

        s.close();
        ss.close();
    }
}
