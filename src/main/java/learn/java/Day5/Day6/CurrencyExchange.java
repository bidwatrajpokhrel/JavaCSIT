package learn.java.Day5.Day6;

public class CurrencyExchange {

    private Currency from;

    private Currency to;

    private Float amount;

    CurrencyExchange(Currency from, Currency to, Float amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public Float getConvertedAmount() {
        Float amountInUSD = amount / from.exchangeRateWithUSD;
        Float amountInDesiredCurrency = amountInUSD * to.exchangeRateWithUSD;

        return amountInDesiredCurrency;
    }


    public static void main(String[] args) {
        CurrencyExchange usdToNPR = new CurrencyExchange(Currency.USD, Currency.GBP, 1000f);

        System.out.println(usdToNPR.getConvertedAmount());

//        Float amountInPounds = 100f;
//
//        Float amountInUSD = Currency.GBP.exchangeRateWithUSD * amountInPounds;
//
//        System.out.println(amountInUSD);
    }
}
