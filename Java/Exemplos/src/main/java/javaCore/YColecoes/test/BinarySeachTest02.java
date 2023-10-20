package javaCore.YColecoes.test;


import javaCore.YColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySeachTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

  MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();

        mangas.add(new Manga(5L, "Attack", 19.9));
        mangas.add(new Manga(4L, "Berserk", 15.50));
        mangas.add(new Manga(3L, "Pokemon", 25.00));
        mangas.add(new Manga(2L, "Dragon Ball", 30.1));
        mangas.add(new Manga(1L, "Titan", 20.2));

        //Collections.sort(mangas);

        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga mangaToSearch = new Manga(2L, "Titan", 20.2);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch,mangaByIdComparator));
    }
}
