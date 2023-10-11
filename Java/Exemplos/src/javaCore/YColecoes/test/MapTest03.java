package javaCore.YColecoes.test;

import javaCore.YColecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William");
        Consumidor consumidor2 = new Consumidor("DevDojo");


        Manga manga1 = new Manga(5L, "Attack", 19.9);
        Manga manga2 = new Manga(4L, "Berserk", 15.50);
        Manga manga3 = new Manga(3L, "Pokemon", 25.00);
        Manga manga4 = new Manga(2L, "Dragon Ball", 30.1);
        Manga manga5 = new Manga(1L, "Titan", 20.2);

        List<Manga> manngaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> manngaConsumidor2List = List.of(manga3, manga4);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, manngaConsumidor1List);
        consumidorMangaMap.put(consumidor2, manngaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }
        }

    }
}
