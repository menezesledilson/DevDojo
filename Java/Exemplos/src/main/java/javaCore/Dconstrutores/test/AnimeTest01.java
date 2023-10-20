package javaCore.Dconstrutores.test;


import javaCore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akuma Drive", "Tv", 12, "Ação", "producão");
        anime.imprime();
    }
}
