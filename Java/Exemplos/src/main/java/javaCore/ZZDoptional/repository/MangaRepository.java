package javaCore.ZZDoptional.repository;

import javaCore.ZZDoptional.Dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Boku no Hero", 50), new Manga(2, "Hero", 50));

    public static Optional<Manga> findById(Integer id) {
        return findBy(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title) {
        return findBy(m -> m.getTitle().equals(title));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
                break; // Saia do loop quando encontrar um manga correspondente
            }
        }
        return Optional.ofNullable(found);
    }
}
