package collections;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();



        names.add("Taras");
        names.add("Max");
        names.add("Kyril");

        System.out.println(names);
    }
}
