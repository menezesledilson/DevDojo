package javaCore.ZZCLambda.test;

import javaCore.ZZCLambda.Dominio.Anime;
import javaCore.ZZCLambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeAcomparators = AnimeComparators ::new;
        AnimeComparators animeComparators = newAnimeAcomparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("one piece", 900), new Anime("naruto", 500)));
animeList.sort(animeComparators ::compareByEpisodesNonStatic);

        System.out.println(animeList);

       // BiFunction<String, Integer, Anime> animeBiFunction = ( title, episodes) -> new Anime(title, episodes) ;                                                                    s, i -> new Anime()
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime :: new ;
        System.out.println(animeBiFunction2.apply("Super Cammpeões", 36));
    }
}
