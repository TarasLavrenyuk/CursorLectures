package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list.remove("IUI"));

        for (String str : list) {
            System.out.println(str);
        }
    }

}
