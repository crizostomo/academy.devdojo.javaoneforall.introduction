package academy.devdojo.javaoneforall.javacore.ZZIjdbc.test;

//271 - JDBC pt 20 - Connected RowSet - JdbcRowSet pt 01
//272 - JDBC pt 21 - Connected RowSet - JdbcRowSet pt 02

import academy.devdojo.javaoneforall.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.javaoneforall.javacore.ZZIjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
//        ProducerServiceRowSet.updateJdbcRowSet(producerToUpdate);
        ProducerServiceRowSet.updateCachedRowSet(producerToUpdate);


//        log.info("------------------------");
//
//        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("madhouse");
//        log.info(producers);
    }
}
