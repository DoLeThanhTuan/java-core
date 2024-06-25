package i18n;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormat {
    public static String formatDateByLocale(LocalDate date, Locale locale){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
                .withLocale(locale);
        return dateFormatter.format(date);
    }
    public static String formatDateByPattern(LocalDate date,String pattern){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);
        return dateFormatter.format(date);
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Locale vi = new Locale("vi");
        Locale ja = new Locale("ja");

        String s1 = formatDateByLocale(today, vi);
        System.out.println("s1 = " + s1);
        String s2 = formatDateByLocale(today, ja);
        System.out.println("s2 = " + s2);

        String s3 = formatDateByPattern(today, "yyyy-MM-dd");
        System.out.println("s3 = " + s3);
        String s4 = formatDateByPattern(today, "EEEE ,yyyy-MM-dd");
        System.out.println("s4 = " + s4);
    }
}
