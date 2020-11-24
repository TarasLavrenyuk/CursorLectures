package generics;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        GenericArray<Integer> integerArray = new GenericArray<>();
//        integerArray.displayArray();
//
//        integerArray.addToTheEnd(4);
//        integerArray.addToTheEnd(2);
//        integerArray.addToTheEnd(10);
//
//        integerArray.displayArray();
//        System.out.println();
//
//        System.out.println(integerArray.removeFromTheEnd());
//
//        System.out.println();
//        integerArray.displayArray();

        GenericArray<String> stringArray = new GenericArray<String>();
        stringArray.addToTheEnd("Elon");
        stringArray.addToTheEnd("Jeff");
        stringArray.displayArray();
    }

}
