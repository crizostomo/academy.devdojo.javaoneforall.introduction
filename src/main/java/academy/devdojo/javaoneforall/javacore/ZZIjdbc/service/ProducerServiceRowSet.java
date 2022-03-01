package academy.devdojo.javaoneforall.javacore.ZZIjdbc.service;

//271 - JDBC pt 20 - Connected RowSet - JdbcRowSet pt 01
//272 - JDBC pt 21 - Connected RowSet - JdbcRowSet pt 02
//273 - JDBC pt 22 - Disconnected RowSet - CachedRowSet

import academy.devdojo.javaoneforall.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.javaoneforall.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name){
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void updateJdbcRowSet(Producer producer){
        ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }

    public static void updateCachedRowSet(Producer producer){
        ProducerRepositoryRowSet.updateCachedRowSet(producer);
    }

}
