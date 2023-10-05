package javaCore.Sformatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {

        Locale localeItaly = new Locale( "it", "IT");
        Locale localeCH = new Locale( "it", "CH");
        Locale localIndia = new Locale("hi","IN");
        Locale localJapao = new Locale("ja","JP");

        Calendar calendar = Calendar.getInstance();

       DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localJapao);

        System.out.println("Italia " +df1.format(calendar.getTime()));
        System.out.println("Suiça " +df2.format(calendar.getTime()));
        System.out.println("India " +df3.format(calendar.getTime()));
        System.out.println("japao " +df4.format(calendar.getTime()));


        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localJapao.getDisplayCountry(localJapao));
    }
}