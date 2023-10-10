package javaCore.YColecoes.test;

import javaCore.YColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);

        mangas.add("Attack");
        mangas.add("Berserk");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball");
        mangas.add("Titan");
        Collections.sort(mangas);


        List<Double> dinheiros = new ArrayList<>();

        dinheiros.add(100.21);
        dinheiros.add(90.22);
        dinheiros.add(70.23);
        dinheiros.add(60.24);
        dinheiros.add(80.25);
        System.out.println(dinheiros);



        Collections.sort(dinheiros);

        for (String manga : mangas) {
            System.out.println(manga);
        }
    }
}
