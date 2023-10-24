package javaCore.ZZJCrud.test;

import javaCore.ZZJCrud.service.AnimeService;
import javaCore.ZZJCrud.service.ProduceService;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws IllegalAccessException {
        int op;
        while (true) {
            menu();
            op = Integer.parseInt(SCANNER.nextLine());
            if (op == 0) break;
            switch (op) {
                case 1 -> ProduceService.menu(op);
                case 2 -> AnimeService.menu(op);

            }

        }
    }

    private static void menu() {
        System.out.println("Type the number of your operation");
        System.out.println("1. Producer");
        System.out.println("2. Anime");
        System.out.println("0. Exit");

    }

    private static void producerMenu() {
        System.out.println("Type the number of your operation");
        System.out.println("1. Seach for producer");
        System.out.println("2. Delete producer");
        System.out.println("3. Save producer");
        System.out.println("4. Update producer");

        System.out.println("9. Go Back");
    }

    private static void animeMenu() {
        System.out.println("Type the number of your operation");
        System.out.println("1. Seach for anime");
        System.out.println("2. Delete anime");
        System.out.println("3. Save anime");
        System.out.println("4. Update anime");

        System.out.println("9. Go Back");
    }
}
