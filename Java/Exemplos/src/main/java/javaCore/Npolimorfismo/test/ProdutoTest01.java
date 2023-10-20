package javaCore.Npolimorfismo.test;

import javaCore.Npolimorfismo.dominio.Computador;
import javaCore.Npolimorfismo.dominio.Televisao;
import javaCore.Npolimorfismo.dominio.Tomate;
import javaCore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i70", 11000);
        Tomate tomate = new Tomate("Tomate siciliano", 10);

        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(tomate);

        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
