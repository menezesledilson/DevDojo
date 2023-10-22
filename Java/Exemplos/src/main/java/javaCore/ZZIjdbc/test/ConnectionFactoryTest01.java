package javaCore.ZZIjdbc.test;


import javaCore.ZZIjdbc.Service.ProducerService;
import javaCore.ZZIjdbc.dominio.Producer;
import javaCore.ZZIjdbc.repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) throws IllegalAccessException {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
        // ProducerService.save(producer);
       // ProducerService.delete(5);
       // ProducerService.update(producerToUpdate);
       List<Producer> producers = ProducerService.findAll();
       // List<Producer> producers = ProducerService.findByName("Mad");
        log.info("Producers found '{}' ",producers);

    }
}
