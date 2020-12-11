package staticandoptional;

public class Main {

    public static void main(String[] args) {
        System.out.println(Car.getNumberOfCreatedCars());
        Car audi = new Car("Audi", 1445);
        System.out.println(Car.getNumberOfCreatedCars());

        System.out.println(audi.model);
        System.out.println(audi.price);

        System.out.println(audi.numberOfCreatedCars); // bad
        System.out.println(Car.numberOfCreatedCars); // nice

        audi.getNumberOfCreatedCars(); // bad
        Car.getNumberOfCreatedCars(); // nice
    }
}