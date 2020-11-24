package generics;

import java.util.Arrays;

public class IntArray {

    private int[] array = new int[0];

    public void addToTheEnd(int newElement) {
        int[] newArray = Arrays.copyOf(array, size() + 1);
        newArray[newArray.length - 1] = newElement;
        array = newArray;
    }

    public int removeFromTheEnd() {
        int result = array[size() - 1];
        array = Arrays.copyOf(array, size() - 1);
        return result;
    }

    public int get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public void displayArray() {
        if (size() == 0) System.out.println("Empty array!");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
