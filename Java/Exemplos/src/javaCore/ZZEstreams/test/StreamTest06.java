package javaCore.ZZEstreams.test;

import javaCore.ZZEstreams.dominio.LightNovel;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest06 {
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
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3 )
                .findAny()
                .ifPresent(System.out ::println);

        lightNovels
                .stream()
                .filter(ln -> ln.getPrice() > 3)
                .findFirst()
                .ifPresent(System.out ::println);
    }
}
