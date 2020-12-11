package observer.builder;

public class Apartment {

    private String address;
    private Integer squareMeters;
    private Integer numberOfRooms;
    private Integer floor;
    private boolean hasBalcony;
    private boolean installedKitchen;
    private boolean oldBuilding;

    public Apartment() {
    }

    public Apartment(String address, int squareMeters, int numberOfRooms) {
        this.address = address;
        this.squareMeters = squareMeters;
        this.numberOfRooms = numberOfRooms;
    }

    public Apartment(int floor, boolean hasBalcony, boolean installedKitchen, boolean oldBuilding) {
        this.floor = floor;
        this.hasBalcony = hasBalcony;
        this.installedKitchen = installedKitchen;
        this.oldBuilding = oldBuilding;
    }

    public Apartment(int numberOfRooms, int floor, boolean hasBalcony) {
        this.numberOfRooms = numberOfRooms;
        this.floor = floor;
        this.hasBalcony = hasBalcony;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isInstalledKitchen() {
        return installedKitchen;
    }

    public void setInstalledKitchen(boolean installedKitchen) {
        this.installedKitchen = installedKitchen;
    }

    public boolean isOldBuilding() {
        return oldBuilding;
    }

    public void setOldBuilding(boolean oldBuilding) {
        this.oldBuilding = oldBuilding;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "address='" + address + '\'' +
                ", squareMeters=" + squareMeters +
                ", numberOfRooms=" + numberOfRooms +
                ", floor=" + floor +
                ", hasBalcony=" + hasBalcony +
                ", installedKitchen=" + installedKitchen +
                ", oldBuilding=" + oldBuilding +
                '}';
    }
}
