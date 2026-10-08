class Data {
    int a = 10, b = 20;

    synchronized void swap() {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}

public class SwapJava {
    public static void main(String[] args) throws Exception {

        Data d = new Data();

        Thread t1 = new Thread(() -> d.swap());

        Thread t2 = new Thread(() ->
            System.out.println("Read values: a = " + d.a + ", b = " + d.b)
        );

        t1.start();
        t1.join();

        t2.start();
    }
}