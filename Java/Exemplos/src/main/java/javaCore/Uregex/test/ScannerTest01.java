package javaCore.Uregex.test;

public class ScannerTest01 {

    //token delimitadores
    public static void main(String[] args) {
        String texto = "levi, Eren, Mikasa";

        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
