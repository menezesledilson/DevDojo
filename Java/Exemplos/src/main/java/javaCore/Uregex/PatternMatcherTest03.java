package javaCore.Uregex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Expressão regular
public class PatternMatcherTest03 {

    public static void main(String[] args) {

        // \d = todos os digitos
        // \D = tudo o que não for digito
        // \s = Espaõs em brancos \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos,
        //\W = Tudo o que não for incluso no \w
        //      String texto = "aaaa";
        //[] =

        String regex = "0[xX][0-9a-fA-F]";

        String texto2 = "12 0X 0X 0xFFABC 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto " + texto2);

        System.out.println("indice : 0123456789");

        System.out.println("regex" + regex);

        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        int numeroHex = 0xDA;
        System.out.println(numeroHex);
    }
}
