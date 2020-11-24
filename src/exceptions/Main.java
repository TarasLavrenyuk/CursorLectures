package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        getTextFromFileWithRecourses("src/exceptions/test.txt");
        try {
            getTextFromFileWithRecourses("");
        } catch (CustomFileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static int getFirstElement(int[] array) {
        try {
            return array[0];
        } finally {
            System.out.println("Block finally!");
        }
    }

    private static void getTextFromFile(String path) {
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void getTextFromFileWithRecourses(String path) throws CustomFileNotFoundException {
        if (path.isBlank()) {
            throw new CustomFileNotFoundException();
        }
        try (
                Scanner scanner = new Scanner(new File(path))
        ) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
