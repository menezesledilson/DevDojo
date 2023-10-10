package javaCore.YColecoes.test;

import javaCore.YColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(5L, "Attack", 19.9));
        mangas.add(new Manga(4L, "Berserk", 15.50));
        mangas.add(new Manga(3L, "Pokemon", 25.00));
        mangas.add(new Manga(2L, "Dragon Ball", 30.1));
        mangas.add(new Manga(1L, "Titan", 20.2));
        for (Manga manga : mangas) {
            System.out.print(mangas);
        }
        Collections.sort(mangas);
        System.out.println("---------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas,new MangaByIdComparator());

        System.out.println("---------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
