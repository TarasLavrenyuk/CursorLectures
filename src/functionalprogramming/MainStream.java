package functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class MainStream {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Taras", "Max", "Alex", "Oleg", "Jan");

        long a = names.stream()
                .filter(name -> name.length() > 3)
                .count();
    }

}
