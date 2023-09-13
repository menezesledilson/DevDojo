package javaCore.Hherenca.test;

import javaCore.Hherenca.dominio.Endereco;
import javaCore.Hherenca.dominio.Funcionario;
import javaCore.Hherenca.dominio.Pessoa;

public class HerancaTest01   {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua x");
        endereco.setCep("1234-456");

        Pessoa pessoa = new Pessoa("Toyohisa");

        pessoa.setCpf("11111111111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda ");

        funcionario.setCpf("222222 ");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        System.out.println("---------------------");

        funcionario.imprime();

    }
}
