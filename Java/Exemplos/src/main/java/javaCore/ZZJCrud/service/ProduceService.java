package javaCore.ZZJCrud.service;

import javaCore.ZZJCrud.dominio.Producer;
import javaCore.ZZJCrud.repositotry.ProducerRepository;
import lombok.extern.log4j.Log4j2;

import java.util.Optional;
import java.util.Scanner;

@Log4j2
public class ProduceService {
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
        System.out.println("Type the name or empty to view all producers");
        String name = SCANNER.nextLine();
        ProducerRepository.findByName(name)
                .forEach(p -> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));
    }

    private static void delete() {
        try {
            System.out.println("Type the ID of the producer you want to delete");
            int id = Integer.parseInt(SCANNER.nextLine());
            System.out.println("Are you sure? (Y/N)");
            String choice = SCANNER.nextLine();
            if ("Y".equalsIgnoreCase(choice)) {
                ProducerRepository.delete(id);
                System.out.println("Producer deleted successfully.");
            } else {
                System.out.println("Deletion canceled.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for ID. Please enter a valid number.");
        }
    }

    private static void save() {
        System.out.println("Type the name of the producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
        System.out.println("Producer saved successfully.");
    }

    private static void update() {
        try {
            System.out.println("Type the ID of the producer you want to update");
            int id = Integer.parseInt(SCANNER.nextLine());
            Optional<Producer> producerOptional = ProducerRepository.findById(id);
            if (producerOptional.isPresent()) {
                Producer producerFromDb = producerOptional.get();
                System.out.println("Current producer name: " + producerFromDb.getName());
                System.out.println("Type the new name or press enter to keep the same");
                String name = SCANNER.nextLine();
                name = name.isEmpty() ? producerFromDb.getName() : name;
                Producer producerToUpdate = Producer.builder()
                        .id(producerFromDb.getId())
                        .name(name)
                        .build();
                ProducerRepository.update(producerToUpdate);
                System.out.println("Producer updated successfully.");
            } else {
                System.out.println("Producer not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for ID. Please enter a valid number.");
        }
    }
}
