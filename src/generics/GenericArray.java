package generics;

import java.util.Arrays;

public class GenericArray<T> {

    private T[] array;

    public GenericArray() {
        this.array = ((T[]) new Object[0]);
    }

    public void addToTheEnd(T newElement) {
        T[] newArray = Arrays.copyOf(array, size() + 1);
        newArray[newArray.length - 1] = newElement;
        array = newArray;
    }

    public T removeFromTheEnd() {
        T result = array[size() - 1];
        array = Arrays.copyOf(array, size() - 1);
        return result;
    }

    public T get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public void displayArray() {
        if (size() == 0) System.out.println("Empty array!");
        for (T i : array) {
            System.out.println(i);
        }
    }
}
