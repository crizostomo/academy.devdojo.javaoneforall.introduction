package academy.devdojo.javaoneforall.javacore.ZZIjdbc.repository;

//271 - JDBC pt 20 - Connected RowSet - JdbcRowSet pt 01
//272 - JDBC pt 21 - Connected RowSet - JdbcRowSet pt 02
//273 - JDBC pt 22 - Disconnected RowSet - CachedRowSet

import academy.devdojo.javaoneforall.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.javaoneforall.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.javaoneforall.javacore.ZZIjdbc.listener.CustomRowSetListener;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProducerRepositoryRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name){
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        List<Producer> producers = new ArrayList<>();
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute();
            while (jrs.next()){
                Producer producer = Producer
                        .builder()
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

//    public static void updateJdbcRowSet(Producer producer){
//        String sql = "UPDATE `anime_store`.`producer` SET `Name` = ? WHERE (`id` = ?);";
//        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
//            jrs.setCommand(sql);
//            jrs.setString(1, producer.getName());
//            jrs.setInt(2, producer.getId());
//            jrs.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public static void updateJdbcRowSet(Producer producer){
        String sql = "SELECT * FROM anime_store.producer WHERE (`id` = ?);";
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute();
            if(!jrs.next()) return;
            jrs.updateString("name", producer.getName());
            jrs.updateRow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateCachedRowSet(Producer producer){
//        String sql = "SELECT * FROM anime_store.producer WHERE (`id` = ?);";
        /**
         * It happened an error by using 'anime_store.' the query was right, but
         * it had to be removed since intellij was adding another 'anime_store'
         * to the query
         */
        String sql = "SELECT * FROM producer WHERE (`id` = ?);";

        try (CachedRowSet crs = ConnectionFactory.getCachedRowSet();
        Connection connection = ConnectionFactory.getConnection()){
            connection.setAutoCommit(false);
//            crs.addRowSetListener(new CustomRowSetListener());
            crs.setCommand(sql);
            crs.setInt(1, producer.getId());
            crs.execute(connection);
            if(!crs.next()) return;
            crs.updateString("name", producer.getName());
            crs.updateRow();
//            TimeUnit.SECONDS.sleep(10); Problem can happen when trying to update
            crs.acceptChanges();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
