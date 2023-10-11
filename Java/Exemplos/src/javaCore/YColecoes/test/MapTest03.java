package javaCore.YColecoes.test;

import javaCore.YColecoes.dominio.Consumidor;
import javaCore.YColecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William");
        Consumidor consumidor2 = new Consumidor("DevDojo");


        Manga manga1 = new Manga(5L, "Attack", 19.9);
        Manga manga2 = new Manga(4L, "Berserk", 15.50);
        Manga manga3 = new Manga(3L, "Pokemon", 25.00);
        Manga manga4 = new Manga(2L, "Dragon Ball", 30.1);
        Manga manga5 = new Manga(1L, "Titan", 20.2);

        Map<Consumidor,Manga> consumidorManga= new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);

        for(Map.Entry<Consumidor,Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
