package javaCore.ZZIjdbc.Service;

import javaCore.ZZIjdbc.dominio.Producer;
import javaCore.ZZIjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Producer>findbyNameJdbcRowSet(String name){
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }
    public static void updateJdbcRowSet(Producer producer){
         // ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }  public static void updateCacheRowSet(Producer producer){
          ProducerRepositoryRowSet.updateCacheRowSet(producer);
    }


}
