package enums;

public enum Month {

    JANUARY(1),
    MARCH(3);

    private int monthNumber;

    Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }
}
