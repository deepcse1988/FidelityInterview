package BusinessLogic;
import Interface.Currencies;

public class Euros  implements Currencies {
    String currency;
    double balance;
    double remainingBalance;
    public Euros(double balance, String currency) {
        this.balance = balance;
        this.currency = currency;
    }
    long twoEuro;
    int fiftyCents;
    int twentyCents;
    int tenCents;
    int  fiveCents;
    int oneCents;
    public void setDenominations() {
        twoEuro = (long) balance/200 ;
        remainingBalance = balance % 200;
        fiftyCents = (int) remainingBalance/50;
        remainingBalance = remainingBalance % 50;
        twentyCents = (int) remainingBalance/20;
        remainingBalance = remainingBalance % 20;
        tenCents = (int) remainingBalance/10;
        remainingBalance = remainingBalance % 10;
        fiveCents = (int) remainingBalance/5;
        remainingBalance = remainingBalance %5;
        oneCents = (int) remainingBalance/1;
    }
    public void printDenominations() {
        System.out.println("Denomination for " + balance + " Euros is: " + twoEuro + " two Euro "
                + fiftyCents + " 50c "
                + twentyCents + " 20c "
                + tenCents + " 10c"
                + fiveCents + " 5c and "
                + oneCents + " 1c coins");
    }
}
