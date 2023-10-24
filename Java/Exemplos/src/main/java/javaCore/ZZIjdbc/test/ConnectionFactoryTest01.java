package javaCore.ZZIjdbc.test;


import javaCore.ZZIjdbc.Service.ProducerService;
import javaCore.ZZIjdbc.dominio.Producer;
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
        // List<Producer> producers = ProducerService.findAll();
        // List<Producer> producers = ProducerService.findByName("Mad");
        // log.info("Producers found '{}' ",producers);
        // ProducerService.showProducerMetaData();
        // ProducerService.showDriverMetaData();
        // ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndToUpperCase("House");
//        log.info("Produers found '{}' ", producers);
//        List<Producer> producers = ProducerService.findByNameAndToUpperCase("A-1 pictures");
//        log.info("Produers found '{}' ", producers);

        List<Producer> producers = ProducerService.findByNamePreparedStatement("Bo");
        log.info("Producers found '{}'",producers);
    }
}
