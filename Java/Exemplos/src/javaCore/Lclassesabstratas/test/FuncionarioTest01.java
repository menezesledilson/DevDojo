package javaCore.Lclassesabstratas.test;

import javaCore.Lclassesabstratas.dominio.Desenvolvedor;
import javaCore.Lclassesabstratas.dominio.Funcionario;
import javaCore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Kil",12000);
        System.out.println(desenvolvedor);
        System.out.println(gerente);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
