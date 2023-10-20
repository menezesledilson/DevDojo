package javaCore.YColecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

            // Converter lista para array
            Integer[] listToArray = numeros.toArray(new Integer[numeros.size()]);
            System.out.println(Arrays.toString(listToArray));

            // Criar um array de Integer
            Integer[] numerosArray = new Integer[3];
            numerosArray[0] = 1;
            numerosArray[1] = 2;
            numerosArray[2] = 3;

            // Converter array para lista
            List<Integer> arrayToList = new ArrayList<>(Arrays.asList(numerosArray));
            arrayToList.set(0, 12);

            // Imprimir o array e a lista
            System.out.println(Arrays.toString(numerosArray));
            System.out.println(arrayToList);
            System.out.println("---------------------");

            // Converter array para lista usando ArrayList
            List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
            numerosList.add(15);
            System.out.println(numerosList);

            // Criar uma lista de strings
            List<String> strings = Arrays.asList("1", "2");
            //List<String> outraLista = List.of("1", "2");
        }
    }


