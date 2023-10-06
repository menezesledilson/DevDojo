package javaCore.Uregex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Expressão regular
public class PatternMatcherTest04 {

    public static void main(String[] args) {

        // \d = todos os digitos
        // \D = tudo o que não for digito
        // \s = Espaõs em brancos \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos,
        //\W = Tudo o que não for incluso no \w
        //      String texto = "aaaa";
        //[] =
        //Quantificadores ? zero ou uma
        // * Zero ou mais
        // + uma ou mais
        //{n,m} de n até m
        //() agrupamentto
        //| o(v|o) o ovo // oco
        //$ representa o fim da linha
        // ponto . 1.3 =123, 133. 1@03, 1A3

        String regex = "0[xX]([0-9a-fA-F])+\\s|$";

        String texto = "12 0X 0X 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto " + texto);

        System.out.println("indice : 0123456789");

        System.out.println("regex" + regex);

        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}
