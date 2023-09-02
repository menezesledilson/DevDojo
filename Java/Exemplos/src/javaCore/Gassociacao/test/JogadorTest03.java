package javaCore.Gassociacao.test;

import javaCore.Gassociacao.dominio.Jogador;
import javaCore.Gassociacao.dominio.Time;
//relacionamento bidirecional
public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Time time = new Time("Brasil");

        Jogador[] jogadores = {jogador};

        jogador.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("---Jogador----");

        jogador.imprime();

        System.out.println("---Time----");

        time.imprime();
    }
}
