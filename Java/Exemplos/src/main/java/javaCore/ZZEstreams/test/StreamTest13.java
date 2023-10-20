package javaCore.ZZEstreams.test;

import javaCore.ZZEstreams.dominio.Category;
import javaCore.ZZEstreams.dominio.LightNovel;
import javaCore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
      Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln ->{
                        return ln.getPrice() < 6  ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
                }
    ));
        System.out.println(collect);

        //Map<Category>, Map<Promotion>, List<LightMovel>

        Map<Category, Map<Promotion,List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,Collectors.groupingBy(ln ->{
                    return ln.getPrice() < 6  ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
                }
        )));
        System.out.println(collect1);
    }
}
