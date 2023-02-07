package util;

public class CurrencyConverter {
    private static final double IOF_PERCENTAGE = 0.06;

    public static double amountToBePaidInReal(double dollarPrice, double howManyDollarsWillBeBought) {
        return dollarPrice * howManyDollarsWillBeBought * (1 + IOF_PERCENTAGE);
    }
}
