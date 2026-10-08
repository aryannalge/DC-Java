import java.rmi.server.*;

public class HelloImpl extends UnicastRemoteObject implements Hello {

    HelloImpl() throws Exception {
        super();
    }

    public String sayHello(String name) {
        return "Hello " + name + " from RMI Server";
    }
}