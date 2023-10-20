package javaCore.Bintroducaometodos.test;

import javaCore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Will");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.impremi();
        System.out.println("Media " + funcionario.getMedia());
    }
}
