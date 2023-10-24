package javaCore.ZZIjdbc.test;

import javaCore.ZZIjdbc.Service.ProducerService;
import javaCore.ZZIjdbc.Service.ProducerServiceRowSet;
import javaCore.ZZIjdbc.dominio.Producer;
import javaCore.ZZIjdbc.repository.ProducerRepositoryRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;
@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
Producer producerToUpdate  = Producer.builder().id(1).name("MAD").build();
        ProducerServiceRowSet.updateCacheRowSet(producerToUpdate);
//        log.info("-----------------------------");
//
//        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbcRowSet("");
//        log.info(producers);
    }
}
