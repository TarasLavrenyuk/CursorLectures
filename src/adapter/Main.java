package adapter;

public class Main {

    public static void main(String[] args) {



    }

    static boolean isYoungerThan(EuropeanCar car1, EuropeanCarAdapter car2) {
        return car1.getKilometrage() < car2.toKm();
    }
}
