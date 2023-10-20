package javaCore.Bintroducaometodos.test;

import javaCore.Bintroducaometodos.dominio.Estudante;
import javaCore.Bintroducaometodos.dominio.ImpressoraEstudante;

import java.sql.SQLOutput;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("---------------");
        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);

        System.out.println("---------------");

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

    }
}
