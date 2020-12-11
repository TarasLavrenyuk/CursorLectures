package functionalprogramming;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        final Function<Float, Integer> getInteger = (Float floatVariable) -> {
            return floatVariable.intValue();
        };

        final Function<Float, Integer> getInteger1 = floatVariable -> floatVariable.intValue();

        final GetInteger getInteger2 = new GetInteger();

        getInteger.apply(0.67f);
        getInteger1.apply(0.67f);
        getInteger2.apply(0.67f);
    }

    static class GetInteger implements Function<Float, Integer> {
        @Override
        public Integer apply(Float aFloat) {
            return aFloat.intValue();
        }
    }
}
