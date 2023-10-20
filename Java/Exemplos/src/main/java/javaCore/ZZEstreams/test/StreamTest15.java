package javaCore.ZZEstreams.test;

import javaCore.ZZEstreams.dominio.Category;
import javaCore.ZZEstreams.dominio.LightNovel;
import javaCore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static javaCore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static javaCore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest15 {
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

        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(Collectors
                .groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

//        Map<Category, Map<Promotion, List<LightNovel>>> collect1 =

        Map<Category, List<Promotion>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toList())));
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
