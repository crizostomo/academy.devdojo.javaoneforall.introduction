package academy.devdojo.javaoneforall.javacore.ZZJcrud.repository;

//275 - JDBC pt 24 - Crud pt 01 - findByName and findAll
//276 - JDBC pt 25 - Crud pt 02 - delete
//277 - JDBC pt 26 - Crud pt 03 - save
//278 - JDBC pt 27 - Crud pt 04 - update

import academy.devdojo.javaoneforall.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.javaoneforall.javacore.ZZJcrud.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {
    public static List<Producer> findByName(String name){
        log.info("Finding producer by name '{}'", name);
        List<Producer> producers = new ArrayList<>();
        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement ps = createPrepareStatementFindByName(conn,name);
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
            log.error("Error trying to find producers by name", e);
        }
        return producers;
    }


    private static PreparedStatement createPrepareStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "%"+name+"%");
        return ps;
    }

    public static Optional<Producer> findById(Integer id){
        log.info("Finding producer by id '{}'", id);
        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement ps = createPrepareStatementFindById(conn,id);
            ResultSet rs = ps.executeQuery();){
            if(!rs.next()) return Optional.empty();
                return Optional.of(Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build());
        } catch (SQLException e) {
            log.error("Error trying to find producers by name", e);
        }
        return Optional.empty();
    }


    private static PreparedStatement createPrepareStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void delete(Integer id){
        log.info("Deleting producer by id '{}'", id);
        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement ps = createPrepareStatementDelete(conn,id)){
            ps.execute();
        } catch (SQLException e) {
            log.error("Error trying to delete producers by id", e);
        }
    }


    private static PreparedStatement createPrepareStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Producer producer){
        log.info("Saving producer '{}'", producer.getName());
        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement ps = createPrepareStatementSave(conn, producer)){
            ps.execute();
        } catch (SQLException e) {
            log.error("Error trying to save producer", e);
        }
    }


    private static PreparedStatement createPrepareStatementSave(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`Name`) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

}
