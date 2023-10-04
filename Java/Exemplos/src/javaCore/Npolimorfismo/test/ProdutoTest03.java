package javaCore.Npolimorfismo.test;

import javaCore.Npolimorfismo.dominio.Computador;
import javaCore.Npolimorfismo.dominio.Produto;
import javaCore.Npolimorfismo.dominio.Tomate;
import javaCore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano ", 20);
        tomate.setDataValidade("11/12/2021");

    }
}
