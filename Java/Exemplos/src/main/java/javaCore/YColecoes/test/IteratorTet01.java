package javaCore.YColecoes.test;


import javaCore.YColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTet01 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Hellsing", 19, 0));
        mangas.add(new Manga(1L, "berserk", 9.5, 5));
        mangas.add(new Manga(3L, "Pokemon", 8, 5));
        mangas.add(new Manga(2L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(4L, "Attack", 15, 7));


        Iterator<Manga> mangaIterator = mangas.listIterator();
        while (mangaIterator.hasNext()) {
      Manga manga = mangaIterator.next();

      if(manga.getQuantidade() == 0 ){
          mangaIterator.remove();
      }
            System.out.println(manga);
        }


//        for (Manga manga : mangas) {
//
//            if(manga.getQuantidade()==0){
//
//                mangas.remove(manga);
//            }
//
//        }

    }
}
