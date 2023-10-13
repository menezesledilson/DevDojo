package javaCore.ZZEstreams.test;

import javaCore.ZZEstreams.dominio.Category;
import javaCore.ZZEstreams.dominio.LightNovel;
import javaCore.ZZEstreams.dominio.Promotion;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = (List.of(

            new LightNovel("Tensei shittara", 8.99, Category.Fantasy),
            new LightNovel("Overlord", 3.99, Category.Fantasy),
            new LightNovel("Violet Evergardem", 5.99, Category.Drama),
            new LightNovel("No game no life", 2.99, Category.Fantasy),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.Fantasy),
            new LightNovel("Kumo desuga", 1.99, Category.Fantasy),
            new LightNovel("Monogatari", 4.99, Category.Romance)
    ));
    public static void main(String[] args) {
    Map<Category, Long> collect= lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1= lightNovels.stream()
                .collect(groupingBy(LightNovel :: getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(groupingBy(LightNovel :: getCategory,
                Collectors.collectingAndThen(Collectors.maxBy((Comparator.comparing(LightNovel::getPrice))), Optional::get)));

        System.out.println(collect2);
    }
}
