package javaCore.ZZJCrud.service;

import javaCore.ZZJCrud.dominio.Anime;
import javaCore.ZZJCrud.dominio.Producer;
import javaCore.ZZJCrud.repositotry.AnimeRepository;
import javaCore.ZZJCrud.repositotry.ProducerRepository;
import lombok.extern.log4j.Log4j2;

import java.util.Optional;
import java.util.Scanner;

@Log4j2
public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        try {
            switch (op) {
                case 1:
                    findByName();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    save();
                    break;
                case 4:
                    update();
                    break;
                default:
                    System.out.println("Not a valid option");
            }
        } catch (Exception e) {
            log.error("Error occurred: " + e.getMessage());
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to view all animes");
        String name = SCANNER.nextLine();
        ProducerRepository.findByName(name)
                .forEach(p -> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));
    }

    private static void delete() {
        try {
            System.out.println("Type the ID of the anime  you want to delete");
            int id = Integer.parseInt(SCANNER.nextLine());
            System.out.println("Are you sure? (Y/N)");
            String choice = SCANNER.nextLine();
            if ("Y".equalsIgnoreCase(choice)) {
                ProducerRepository.delete(id);
                System.out.println("Anime  deleted successfully.");
            } else {
                System.out.println("Deletion canceled.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for ID. Please enter a valid number.");
        }
    }

    private static void save() {
        System.out.println("Type the name of the anime ");
        String name = SCANNER.nextLine();
        System.out.println("Type the number of episodes ");

        int episodes = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id of the producer ");

        Integer producerId = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id of the producer ");

        Anime anime = Anime.builder()
                .episodes(episodes)

                .name(name)
                .producer(Producer.builder().id(producerId)
                        .build())
                .build();
        AnimeRepository.save(anime);

    }

    private static void update() {
        System.out.println("Type the ID of the anime  you want to update");
        Optional<Anime> animeOptional = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));

        if (animeOptional.isEmpty()) {
            System.out.println("Anime not found");
            return;
        }
        Anime animeFromDb = animeOptional.get();
        System.out.println("Anime found" + animeFromDb);

        System.out.println("Type the new name or press enter to keep the same");
        String name = SCANNER.nextLine();

        name = name.isEmpty() ? animeFromDb.getName() : name;

        System.out.println("Type the new number of episodes   ");
        int episodes = Integer.parseInt(SCANNER.nextLine());

        Anime animeToUpdate = Anime.builder()
                .id(animeFromDb.getId())
                .episodes(episodes)
                .producer(animeFromDb.getProducer())
                .name(name)
                .build();
        AnimeRepository.update(animeToUpdate);
    }
}
