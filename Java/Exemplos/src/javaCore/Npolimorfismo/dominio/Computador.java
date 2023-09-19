package javaCore.Npolimorfismo.dominio;

import java.sql.SQLOutput;

public class Computador extends Produto {
    public static  final double IMPOSTO_POR_CENTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculanod impos do Computador");
        return this.valor * IMPOSTO_POR_CENTO ;
    }

}
