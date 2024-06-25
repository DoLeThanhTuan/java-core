package i18n;

import java.util.Locale;

public class NumberFormat {
    public static String numberFormatByLocale(double money , Locale locale){
        java.text.NumberFormat numberFormater = java.text.NumberFormat.getInstance(locale);
        return numberFormater.format(money);
    }
}
