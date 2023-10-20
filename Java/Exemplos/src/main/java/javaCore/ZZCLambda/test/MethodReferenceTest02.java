package javaCore.ZZCLambda.test;

import javaCore.ZZCLambda.Dominio.Anime;
import javaCore.ZZCLambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {

        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("one piece", 900), new Anime("naruto", 500)));

        animeList.sort(animeComparators :: compareByEpisodesNonStatic);

        System.out.println(animeList);


    }
}
