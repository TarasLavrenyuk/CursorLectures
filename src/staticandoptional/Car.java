package staticandoptional;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Car {

    UUID id = UUID.randomUUID();
    String model;
    int price;

    static int numberOfCreatedCars;
    static int generalPrice;
    static Set<String> models;

    static {
        int variable = 2378 * 3242 * 324;

        String string = "Cursor";

        numberOfCreatedCars = variable;
        generalPrice = variable / 321;


        models = new HashSet<>();
    }

    public Car(String model, int price) {
        this.model = model;
        this.price = price;

        generalPrice += price;
        models.add(model);
        increment();
    }

    private void increment() {
        numberOfCreatedCars++;
    }

    public static int getNumberOfCreatedCars() {
        return numberOfCreatedCars;
    }

    public static void printGeneralInformation() {
        System.out.println("numberOfCreatedCars: " + numberOfCreatedCars);
        System.out.println("generalPrice: " + generalPrice);
        System.out.println("models: " + models);
    }

    public static void printCarInformation(Car car) {
        System.out.println("model: " + car.model);
        System.out.println("price: " + car.price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    private static class LeasingHelper {

        int calculateLeasing(int price) {
            numberOfCreatedCars = 4123;

            return 2348239;
        }
    }

    private class BigCar {

        void foo() {
            numberOfCreatedCars = 4123;
        }
    }

}
