import java.rmi.*;

public class Client {

    public static void main(String[] args) throws Exception {

        Hello h = (Hello) Naming.lookup(
            "rmi://localhost/HelloService"
        );

        System.out.println(h.sayHello("Student"));
    }
}