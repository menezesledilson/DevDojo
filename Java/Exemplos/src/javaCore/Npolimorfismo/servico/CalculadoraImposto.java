package javaCore.Npolimorfismo.servico;

import javaCore.Npolimorfismo.dominio.Computador;
import javaCore.Npolimorfismo.dominio.Produto;
import javaCore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de Imposto ");
        double imposto = produto.calcularImposto();
        System.out.println("Produto " + produto.getNome());
        System.out.println("Preço " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

    }

}
