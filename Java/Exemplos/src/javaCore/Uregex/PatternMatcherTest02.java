package javaCore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Expressão regular
public class PatternMatcherTest02 {

    public static void main(String[] args) {

        // \d = todos os digitos
        // \D = tudo o que não for digito
        // \s = Espaõs em brancos \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos,
        //\W = Tudo o que não for incluso no \w
        //      String texto = "aaaa";

        String regex = "\\W";

        String texto2 = "hhj212gvh21";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto " + texto2);

        System.out.println("indice : 0123456789");

        System.out.println("regex" + regex);

        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}
