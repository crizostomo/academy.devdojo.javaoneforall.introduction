package academy.devdojo.javaoneforall.javacore.ZZIjdbc.test;

//256 - JDBC pt 05 - Adding dependency and connecting to the database
//257 - JDBC pt 06 - Inserting data with Statement
//258 - JDBC pt 07 - Lombok and Log4J2
//259 - JDBC pt 08 - Deleting data with Statement
//260 - JDBC pt 09 - Updating data with Statement
//261 - JDBC pt 10 - Searching data with ResultSet pt 01 - findAll
//264 - JDBC pt 13 - DriverMetaData
//265 - JDBC pt 14 - ResultSet.TYPE_SCROLL_INSENSITIVE
//266 - JDBC pt 15 - Updating rows with ResultSet
//267 - JDBC pt 16 - Inserting and Deleting rows with ResultSet
//269 - JDBC pt 18 - PreparedStatement pt 02
//270 - JDBC pt 19 - CallableStatement
//271 - JDBC pt 20 - Connected RowSet - JdbcRowSet pt 01

import academy.devdojo.javaoneforall.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.javaoneforall.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.javaoneforall.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.javaoneforall.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

/**
 * Search on google for log4j2 xml file example and copied the code inside
 * ConsoleAppender and go to "resources" and create a mew file called "log4j2.xml"
 * and paste the copied code inside it
 * Change 'Debug' for 'info' and change the package's name
 */

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
//        Producer producer = Producer.ProducerBuilder.builder().name("Madhouse").build();
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("madhouse").build();

//        ProducerService.save(producer);
//        ProducerService.delete(4);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("h");
//        log.info("Producers found '{}'", producers);
//        ProducerService.showResultSetMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("Bones");
//        log.info("Producers found '{}'", producers);
//        ProducerService.findByNameAndDelete("Bones");

//        List<Producer> producers = ProducerService.findByNamePreparedStatement("mad");
//        log.info("Producers found '{}'", producers);
//        ProducerService.updatePreparedStatement(producerToUpdate);

        List<Producer> producers = ProducerService.findByNameCallableStatement("mad");
        log.info("Producers found '{}'", producers);


    }
}
