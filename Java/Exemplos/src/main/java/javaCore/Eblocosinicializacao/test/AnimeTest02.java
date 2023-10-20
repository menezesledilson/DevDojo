package javaCore.Eblocosinicializacao.test;

import javaCore.Eblocosinicializacao.dominio.Anime01;

public class AnimeTest02 {
    public static void main(String[] args) {
        Anime01 anime01 = new Anime01( "one Piece");

        for (int episodio : anime01.getEpisodios()) {
            System.out.print( episodio + " ");
        }

    }
}
