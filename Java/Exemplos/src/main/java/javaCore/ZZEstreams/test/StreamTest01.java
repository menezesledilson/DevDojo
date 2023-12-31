package javaCore.ZZEstreams.test;

import javaCore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


//order todos ligthnovel por title
// retrieve the first 3 light novels with price less than 4
public class StreamTest01 {
    private  static List <LightNovel> lightNovels = (List.of(

            new LightNovel("Tensei shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergardem", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.99)
    ));
    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if(lightNovel.getPrice() <=4){
                 titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3){
                break;
            }
        }
        System.out.println(lightNovels);
        System.out.println(titles);
    }

}
