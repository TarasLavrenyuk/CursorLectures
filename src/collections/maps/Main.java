package collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        final Person person1 = new Person("Taras", "Lavreniuk", 15);
        final Person person2 = new Person("Max", "Bastian", 17);

        HashMap<Person, Integer> persons = new LinkedHashMap<>();

        persons.put(person1, 1997);
        persons.put(person2, 1996);

        System.out.println(persons);

        System.out.println(persons.get(person2));
    }
}
