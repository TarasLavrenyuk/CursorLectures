package observer.builder;

public class ApartmentBuilder {

    private final Apartment apartment;

    public ApartmentBuilder() {
        apartment = new Apartment();
    }

    public ApartmentBuilder setAddress(String address) {
        apartment.setAddress(address);
        return this;
    }
    public ApartmentBuilder setSquareMeters(int squareMeters) {
        apartment.setSquareMeters(squareMeters);
        return this;
    }
    public ApartmentBuilder setNumberOfRooms(int numberOfRooms) {
        apartment.setNumberOfRooms(numberOfRooms);
        return this;
    }
    public ApartmentBuilder setFloor(int floor) {
        apartment.setFloor(floor);
        return this;
    }
    public ApartmentBuilder setHasBalcony(boolean hasBalcony) {
        apartment.setHasBalcony(hasBalcony);
        return this;
    }
    public ApartmentBuilder setInstalledKitchen(boolean installedKitchen) {
        apartment.setInstalledKitchen(installedKitchen);
        return this;
    }
    public ApartmentBuilder setOldBuilding(boolean oldBuilding) {
        apartment.setOldBuilding(oldBuilding);
        return this;
    }

    public Apartment build() {
        return apartment;
    }
}
