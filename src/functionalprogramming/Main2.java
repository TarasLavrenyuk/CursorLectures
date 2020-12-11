package functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    final static List<String> strings = new ArrayList<>();

    public static void main(String[] args) {
        final IntegerPlusFive plusFive = n -> {
            strings.add(n + "");
            return n + 5;
        };
    }

    private static int plusTen(int number, IntegerPlusFive plusFive) {
        return plusFive.plusSix(number + 5);
    }
}
