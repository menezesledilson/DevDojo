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

    private static void requireValidId(Integer id) throws IllegalAccessException {
        if (id == null || id <= 0) {
            throw new IllegalAccessException("Invalid value for id");
        }
    }
}
