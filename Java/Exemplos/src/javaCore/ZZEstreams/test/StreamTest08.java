package javaCore.ZZEstreams.test;

import javaCore.ZZEstreams.dominio.LightNovel;

import java.util.List;
import java.util.stream.DoubleStream;

public class StreamTest08 {
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
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
    }
}
