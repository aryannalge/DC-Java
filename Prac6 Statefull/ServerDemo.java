import java.util.*;

public class ServerDemo {

    static Map<String, Integer> state = new HashMap<>();

    static void stateful(String client) {
        int count = state.getOrDefault(client, 0) + 1;
        state.put(client, count);

        System.out.println(
            "Stateful " + client + ": request " + count
        );
    }

    static void stateless(String client) {
        System.out.println(
            "Stateless " + client + ": request handled"
        );
    }

    public static void main(String[] args) {

        stateful("C1");
        stateful("C1");

        stateless("C1");
        stateless("C1");
    }
}