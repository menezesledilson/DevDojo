package javaCore.ZZEstreams.test;

import javaCore.ZZEstreams.dominio.Category;
import javaCore.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        Map<Category,List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();
        for(LightNovel lightNovel : lightNovels){
            switch( lightNovel.getCategory()){
                case Drama: drama.add(lightNovel); break;
                case Fantasy: fantasy.add(lightNovel); break;
                case Romance: romance.add(lightNovel); break;
            }
        }
        categoryLightNovelMap.put(Category.Drama, drama);
        categoryLightNovelMap.put(Category.Fantasy, fantasy);
        categoryLightNovelMap.put(Category.Romance, romance);

        System.out.println(categoryLightNovelMap);

       Map<Category, List <LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
