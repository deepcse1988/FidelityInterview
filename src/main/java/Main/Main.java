package Main;
import Factory.CurrencyFactory;
import Interface.Currencies;

public class Main {
    public static void main(String args[]) {
        double balance = 87;
        String currency = "USD"; // Valid inputs are "USD" and "Euros"
        CurrencyFactory currFactory = new CurrencyFactory();
        Currencies currencyObject = currFactory.getCurrencyObject(balance, currency);

        // currencyObject is null requesting the user to provide valid currency
        if(currencyObject == null) {
            System.out.println("Provide Valid Currency");
        }

        // First Setting the currencies based on country
        currencyObject.setDenominations();

        // Then printing them
        currencyObject.printDenominations();

    }
}
