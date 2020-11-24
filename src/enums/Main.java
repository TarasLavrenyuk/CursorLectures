package enums;

public class Main {

    public static void main(String[] args) {
        for (Day enumValue : Day.values()) {
            enumValue.printName();
            enumValue.printDayNumber();
            System.out.println();
        }

        Month march = Month.MARCH;
        march.getMonthNumber();
    }
}
