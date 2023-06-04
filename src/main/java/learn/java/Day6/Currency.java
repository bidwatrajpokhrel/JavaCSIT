package learn.java.Day6;

public enum Currency {
    USD(1f),
    GBP(0.8f),
    EUR(0.9f),
    JPY(110f),
    CHY(48f),
    AUD(2f),

    NPR(132f);

    public Float exchangeRateWithUSD;

    Currency(Float exchangeRateWithUSD) {
        this.exchangeRateWithUSD = exchangeRateWithUSD;
    }

}
