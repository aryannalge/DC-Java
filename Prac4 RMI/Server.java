import java.rmi.*;
import java.rmi.registry.*;

public class Server {

    public static void main(String[] args) throws Exception {

        LocateRegistry.createRegistry(1099);

        Naming.rebind("HelloService", new HelloImpl());

        System.out.println("RMI Server ready");
    }
}