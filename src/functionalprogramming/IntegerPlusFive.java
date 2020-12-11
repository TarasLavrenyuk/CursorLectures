package functionalprogramming;


@FunctionalInterface
public interface IntegerPlusFive {

    int plusFive(int number);

    default int plusSix(int number) {
        return number + 6;
    }
}
