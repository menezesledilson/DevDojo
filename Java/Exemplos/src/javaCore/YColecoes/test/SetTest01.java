package javaCore.YColecoes.test;

import javaCore.YColecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {

    public static void main(String[] args) {

        //set não precisa repetir hashSet Elementos unicos
        //   Set<Manga> mangas = new HashSet<>();

        Set<Manga> mangas = new LinkedHashSet<>();

        mangas.add(new Manga(5L, "Hellsing", 19, 0));
        mangas.add(new Manga(1L, "berserk", 9.5, 5));
        mangas.add(new Manga(3L, "Pokemon", 8, 5));
        mangas.add(new Manga(2L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(4L, "Attack", 15, 7));


        for (Manga manga : mangas) {
            System.out.println(manga);

        }
    }
}
