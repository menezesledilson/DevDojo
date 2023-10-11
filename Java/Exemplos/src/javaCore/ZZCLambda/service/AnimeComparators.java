package javaCore.ZZCLambda.service;

import javaCore.ZZCLambda.Dominio.Anime;

public class AnimeComparators {
public static int compareByTitle(Anime a1, Anime a2) {
    return a1.getTitle().compareTo(a2.getTitle());
}
}
