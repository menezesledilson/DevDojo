package javaCore.Sformatacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateTest01 {
    public static void main(String[] args) throws ParseException {

        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        sdf.parse("Amsterdam 05 de outubro de 2023");
    }
}
