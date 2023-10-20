package javaCore.Gassociacao.test;

import javaCore.Gassociacao.dominio.Jogador;
import javaCore.Gassociacao.dominio.Time;

public class Jogadortest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");

        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();

    }
}
