package javaCore.Gassociacao.test;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class LeituraDoTeclado {

    public static void main(String[] args) {
        //chama uma classe
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();

        System.out.println("Digite M ou F para seu sexo");
        char sexo = entrada.next().charAt(0);

        System.out.println("Nome: " + nome);
        System.out.println("Idadde: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
