package observer.builder;

public class Main {

    public static void main(String[] args) {
        Apartment apartment = new Apartment();
        apartment.setAddress("fger,jbf");
        apartment.setFloor(8);

        Apartment apartment1 = new ApartmentBuilder()
                .setInstalledKitchen(false)
                .setHasBalcony(true)
                .setSquareMeters(52)
                .build();

        System.out.println(apartment1);
    }
}
