package javaCore.Csobrecargametodos.test;

import javaCore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init( "Akuma Drive","Tv",12, "Ação");

        anime.imprime();
    }
}
