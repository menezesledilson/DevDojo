package javaCore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();

        List<String> graphicDesigners = List.of("Wildnei suane", "Catarina dos Santos", "Sandy Carol");
        List<String> develops = List.of("William suane", "marina dos Santos", "Carol");
        List<String> students = List.of("Gustavo", "Gustavo Lima", "Gulherme");

        devdojo.add(graphicDesigners);
        devdojo.add(develops);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("-------------");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
