package javaCore.ZZEstreams.test;

import javaCore.ZZEstreams.dominio.LightNovel;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//order todos ligthnovel por title
// retrieve the first 3 light novels with price less than 4
public class StreamTest03 {
    private static List<LightNovel> lightNovels = (List.of(

            new LightNovel("Tensei shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergardem", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.99)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.stream().forEach(System.out::println);
        long count = stream.filter(ln -> ln.getPrice() <= 4).count();
        long count2 = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        System.out.println(count);
        System.out.println(count2);
    }
}
