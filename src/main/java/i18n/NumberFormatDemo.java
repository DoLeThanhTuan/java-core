package i18n;

import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        double money = 12345666666.7893;
        Locale localeVietNam = new Locale("vi");
        Locale localeJapan = new Locale("ja");
        System.out.println(NumberFormat.numberFormatByLocale(money, localeVietNam));
        System.out.println(NumberFormat.numberFormatByLocale(money, localeJapan));
    }
}
