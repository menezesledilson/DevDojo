package javaCore.ZZEstreams.test;

import javaCore.ZZEstreams.dominio.Category;
import javaCore.ZZEstreams.dominio.LightNovel;
import javaCore.ZZEstreams.dominio.Promotion;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static javaCore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static javaCore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 10_0000;
        sumFor(num);
        sumForItrate(num);
        sumParalleStreamIterate(num);
        sumLongStreamIterate(num);
    }

    private static void sumFor(long num) {
        System.out.println("sumFor");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumForItrate(long num) {
        System.out.println("sumForItrate");
        long init = System.currentTimeMillis();

        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
    private static void sumParalleStreamIterate(long num) {
        System.out.println("sumParalleStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num) {
        System.out.println("sumLongStreamIterate");
        long init = System.currentTimeMillis();

        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
