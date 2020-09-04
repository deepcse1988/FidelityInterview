package Factory;

import BusinessLogic.Euros;
import BusinessLogic.USDollars;
import Constants.CurrencyConstants;
import Interface.Currencies;

public class CurrencyFactory {
    public Currencies getCurrencyObject(double balance, String currency) {
        if(currency == null) {
            return null;
        }
        if(currency.equalsIgnoreCase(CurrencyConstants.USD)) {
            return new USDollars(balance, currency);
        } else if (currency.equalsIgnoreCase(CurrencyConstants.EURO)) {
            return new Euros(balance, currency);
        }
        return null;
    }

}