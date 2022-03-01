package academy.devdojo.javaoneforall.javacore.ZZIjdbc.repository;

//257 - JDBC pt 06 - Inserting data with Statement
//260 - JDBC pt 09 - Updating data with Statement
//262 - JDBC pt 11 - Searching data with ResultSet pt 02 - findByName
//263 - JDBC pt 12 - ResultSetMetaData
//264 - JDBC pt 13 - DriverMetaData
//265 - JDBC pt 14 - ResultSet.TYPE_SCROLL_INSENSITIVE
//266 - JDBC pt 15 - Updating rows with ResultSet
//267 - JDBC pt 16 - Inserting and Deleting rows with ResultSet
//268 - JDBC pt 17 - PreparedStatement pt 01
//269 - JDBC pt 18 - PreparedStatement pt 02
//270 - JDBC pt 19 - CallableStatement
//274 - JDBC pt 23 - Transactions

import academy.devdojo.javaoneforall.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.javaoneforall.javacore.ZZIjdbc.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer){
//        String sql = "INSERT INTO `anime_store`.`producer` (`Name`) VALUES ('MadHouse');";
        String sql = "INSERT INTO `anime_store`.`producer` (`Name`) VALUES ('%s');".formatted(producer.getName());
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}'. Affected Rows in the database '{}'", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error trying to insert producer '{}'", producer.getName(), e);
        }
    }

    public static void saveTransaction(List<Producer> producers){
        try(Connection conn = ConnectionFactory.getConnection()){
            conn.setAutoCommit(false);
            preparedStatementSaveTransaction(conn, producers);
            conn.commit();
        } catch (SQLException e) {
            log.error("Error trying to updated producers '{}'", producers, e);
        }
    }

    private static void preparedStatementSaveTransaction(Connection conn, List<Producer> producers) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`Name`) VALUES (?);";
        boolean shouldRollback = false;
        for(Producer p:producers) {
            try(PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, p.getName());
                if(p.getName().equals("White Fox")) throw new SQLException("Can't save white fox")
                ps.execute();
                log.info("Saving '{}'", p.getName());
            }catch (Exception e){
                e.printStackTrace();
                shouldRollback = true;
            }
        }
        if (shouldRollback){
            log.warn("Transaction is going to be rolled back, failed to insert producers '{}'", producers);
            conn.rollback();
        }
    }

    public static void delete(int id){
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer with id '{}'. Affected Rows in the database '{}'", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error trying to delete producer '{}'", id, e);
        }
    }

    public static void update(Producer producer){
        String sql = "UPDATE `anime_store`.`producer` SET `Name` = '%s' WHERE (`id` = '%d');".formatted(producer.getName(),
                producer.getId());
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer with id '{}'. Affected Rows in the database '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error trying to updated producer '{}'", producer.getId(), e);
        }
    }

    public static void updatePreparedStatement(Producer producer){
        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement ps = PreparedStatementUpdate(conn, producer)){
            int rowsAffected = ps.executeUpdate();
            log.info("Updated producer with id '{}'. Affected Rows in the database '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error trying to updated producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement PreparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `Name` = ? WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }

    public static List<Producer> findAll(){
        return findByName("");
//        String sql = "SELECT id, name FROM anime_store.producer;";
//        List<Producer> producers = new ArrayList<>();
//        try(Connection conn = ConnectionFactory.getConnection();
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql)){
//                while (rs.next()){
//                    Producer producer = Producer
//                            .builder()
//                            .id(rs.getInt("id"))
//                            .name(rs.getString("name"))
//                            .build();
//                    producers.add(producer);
//                }
//        } catch (SQLException e) {
//            log.error("Error trying to find all producers", e);
//        }
//        return producers;
    }

    public static List<Producer> findByName(String name){
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()){
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }
        return producers;
    }

    public static List<Producer> findByNamePreparedStatement(String name){
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement ps = PreparedStatementFindByName(conn,name);
            ResultSet rs = ps.executeQuery();){
            while (rs.next()){
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }
        return producers;
    }

    public static List<Producer> findByNameCallableStatement(String name){
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement ps = callableStatementFindByName(conn,name);
            ResultSet rs = ps.executeQuery();){
            while (rs.next()){
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }
        return producers;
    }

    private static PreparedStatement PreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "%"+name+"%");
        return ps;
    }

    private static CallableStatement callableStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "CALL `anime_store`.`sp_get_producer_by_name`(?);";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString(1, "%"+name+"%");
        return cs;
    }

    /**
     * IN WORKBENCH:
     * DELIMITER //
     * create procedure sp_get_producer_by_name(search varchar(100))
     * BEGIN
     * SELECT * FROM producer where name like search;
     * END//
     * DELIMITER ;
     *
     * AFTER: RIGHT CLICK TO THE PROCEDURE CREATED:
     * Send to SQL Editor > Procedure Call and Copy the method
     */


    public static void showResultSetMetaData(){
        String sql = "SELECT * FROM anime_store.producer;";
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int columnCount = rsMetaData.getColumnCount();
            log.info("Column count '{}'", columnCount);
            for (int i = 1; i <= columnCount ; i++) {
                log.info("Table name '{}'", rsMetaData.getTableName(i));
                log.info("Column name '{}'", rsMetaData.getColumnName(i));
                log.info("Column size '{}'", rsMetaData.getColumnDisplaySize(i));
                log.info("Column type '{}'", rsMetaData.getColumnTypeName(i));

            }

        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }
    }

    public static void showDriverMetaData(){
        try(Connection conn = ConnectionFactory.getConnection();){
            DatabaseMetaData dbMetaData = conn.getMetaData();
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                log.info("Supports TYPE_FORWARD_ONLY");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)){
                    log.info("Supports CONCUR_UPDATABLE");
                }
            }
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("Supports CONCUR_UPDATABLE");
                }
            }
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("Supports CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }
    }

    public static void showTypeScrollWorking(){
        String sql = "SELECT * FROM anime_store.producer;";
//        String sql = "SELECT * FROM anime_store.producer order by name desc";

        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql)){
            log.info("Last row? '{}'", rs.last());
            log.info("Row number? '{}'", rs.getRow());
            log.info(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
            log.info("---------------");

            log.info("First row? '{}'", rs.first());
            log.info("Row number? '{}'", rs.getRow());
            log.info(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
            log.info("---------------");

            log.info("Absolute row? '{}'", rs.absolute(2));
            log.info("Row number? '{}'", rs.getRow());
            log.info(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
            log.info("---------------");

            log.info("Relative row? '{}'", rs.relative(-1));
            log.info("Row number? '{}'", rs.getRow());
            log.info(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
            log.info("---------------");

            log.info("Is last row? '{}'", rs.isLast());
            log.info("Row number? '{}'", rs.getRow());
            log.info("---------------");

            log.info("Is first row? '{}'", rs.isFirst());
            log.info("Row number? '{}'", rs.getRow());
            log.info("---------------");

            log.info("Last row? '{}'", rs.last());
            log.info("Row number? '{}'", rs.getRow());
            rs.afterLast();
            while (rs.previous()){
                log.info(Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build());
            }
            log.info("---------------");

        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name){
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()){
                rs.updateString("name", rs.getString("name").toUpperCase());
//                rs.updateString("name", rs.getString("name").toLowerCase());
                rs.updateRow();
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }
        return producers;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name){
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql)){
            if(rs.next()) return producers;

            insertNewProducer(name, rs);

            producers.add(getProducer(rs));
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }
        return producers;
    }

    public static void findByNameAndDelete(String name){
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()){
                log.info("Deleting '{}'", rs.getString("name"));
                rs.deleteRow();
            }
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        return Producer
                .builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build();
    }

    private static void insertNewProducer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.insertRow();
    }

}
