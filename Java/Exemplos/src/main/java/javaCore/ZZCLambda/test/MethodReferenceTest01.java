package javaCore.ZZCLambda.test;

import javaCore.ZZCLambda.Dominio.Anime;
import javaCore.ZZCLambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("one piece", 900), new Anime("naruto", 500)));
        //   Collections.sort(animeList, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));

        Collections.sort(animeList, AnimeComparators::compareByTitle);
        System.out.println(animeList);

    }
}
