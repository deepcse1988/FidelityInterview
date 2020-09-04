package BusinessLogic;
import Interface.Currencies;

public class USDollars implements Currencies {
    double remainingBalance = 0;
    String currency;
    double balance;
    long dollar;
    int quarter;
    int dime;
    int pennyCoins;
    public USDollars(double balance, String currency) {
        this.balance = balance;
        this.currency = currency;
    }
    public void setDenominations() {
        dollar = (long) balance/100;
        remainingBalance = balance % 100;
        quarter = (int) remainingBalance/25;
        remainingBalance = remainingBalance % 25;
        dime = (int) remainingBalance/10;
        remainingBalance = remainingBalance %10;
        pennyCoins = (int) remainingBalance/1;
    }

    public void printDenominations() {
        System.out.println("Denomination for " + balance + " US Dollar is: " + dollar + " dollar "
                + quarter + " quarter "
                + dime + " dime and "
                + pennyCoins + " penny coins" );
    }
}