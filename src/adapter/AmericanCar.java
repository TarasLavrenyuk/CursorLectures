package adapter;

public class AmericanCar implements EuropeanCarAdapter {

    private int millage;

    public AmericanCar(int millage) {
        this.millage = millage;
    }

    public int getMillage() {
        return millage;
    }

    @Override
    public int toKm() {
        return (int) (millage * 1.6);
    }
}
