package javaCore.ZZIjdbc.repository;

import javaCore.ZZIjdbc.conn.ConnectionFactory;
import javaCore.ZZIjdbc.dominio.Producer;
import javaCore.ZZIjdbc.listener.CustomRowSetListener;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProducerRepositoryRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {
        String sql = " Select * from anime_store.producer where name like?;";
        List<Producer> producers = new ArrayList<>();
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%s%%", name));
            jrs.execute();
            while (jrs.next()) {
                Producer producer = Producer.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("name"))
                        .build();

                producers.add(producer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producers;
    }

//    public static void updateJdbcRowSet(Producer producer) {
//        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id´ = ?);";
//
//        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
//            jrs.setCommand(sql);
//            jrs.setString(1, producer.getName());
//            jrs.setInt(2, producer.getId());
//            jrs.execute();
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public static void updateCacheRowSet(Producer producer) {
        String sql = "Select * from anime_store.producer  WHERE (`id´ = ?);";

        try (CachedRowSet crs = ConnectionFactory.getCacheRowSet();
       Connection connection = ConnectionFactory.getConnection()){
            connection.setAutoCommit(false);
            crs.setCommand(sql);
            crs.setInt(1, producer.getId());
            crs.execute(connection);
            if (!crs.next()) return;
            crs.updateString("name",producer.getName());
            crs.updateRow();
            crs.acceptChanges();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
