package javaCore.Bintroducaometodos.test;

import javaCore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Will";
        funcionario.idade = 25;
        funcionario.salarios = new double[]{1200, 987.32, 2000};

        funcionario.impremi();
        funcionario.imprimeMediaSalario();
    }

}
