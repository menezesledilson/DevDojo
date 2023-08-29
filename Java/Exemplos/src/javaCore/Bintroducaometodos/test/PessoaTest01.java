package javaCore.Bintroducaometodos.test;

import javaCore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("jiraya");
        pessoa.setIdade(71);
        pessoa.imprime();
    }

}
