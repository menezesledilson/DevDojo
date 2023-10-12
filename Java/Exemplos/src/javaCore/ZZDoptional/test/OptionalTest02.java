package javaCore.ZZDoptional.test;

import javaCore.ZZDoptional.Dominio.Manga;
import javaCore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");

        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero2"));
        System.out.println(mangaByTitle);

        Manga mangaById=MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException :: new);

        System.out.println(mangaById);

      Manga newManga =  MangaRepository.findByTitle("Dritters")
              .orElseGet(() -> new Manga(3,"Drifters",20));

        System.out.println(newManga);

    }
}
