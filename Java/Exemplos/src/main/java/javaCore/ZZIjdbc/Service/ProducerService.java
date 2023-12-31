package javaCore.ZZIjdbc.Service;

import javaCore.ZZIjdbc.dominio.Producer;
import javaCore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerService.save(producer);

    }

    public static void delete(Integer id) throws IllegalAccessException {
        requireValidId(id);
        ProducerRepository.delete(id);
    }
    public static void update(Producer producer) throws IllegalAccessException {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }
    public static List<Producer> findAll() {
        return ProducerRepository.findAll();
    }
    public static List<Producer> findByName(String name) {
        return ProducerRepository.findByName(name);
    }
    public static List<Producer> findByNamePreparedStatement(String name) {
        return ProducerRepository.findByNamePreparedStatement(name);
    }


    public static void showProducerMetaData() {
         ProducerRepository.showProducerMetaData();
    }

    public static void showDriverMetaData() {
        ProducerRepository.showDriverMetaData();
    }

    public static void showTypeScrollWorking() {
        ProducerRepository.showTypeScrollWorking();
    }

    public static List<Producer> findByNameAndToUpperCase(String name) {
        return ProducerRepository.findByNameAndToUpperCase(name);
    }


    private static void requireValidId(Integer id) throws IllegalAccessException {
        if (id == null || id <= 0) {
            throw new IllegalAccessException("Invalid value for id");
        }
    }
}
