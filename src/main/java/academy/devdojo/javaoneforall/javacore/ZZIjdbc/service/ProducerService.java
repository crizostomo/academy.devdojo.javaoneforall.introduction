package academy.devdojo.javaoneforall.javacore.ZZIjdbc.service;

//259 - JDBC pt 08 - Deleting data with Statement
//260 - JDBC pt 09 - Updating data with Statement
//264 - JDBC pt 13 - DriverMetaData
//265 - JDBC pt 14 - ResultSet.TYPE_SCROLL_INSENSITIVE
//266 - JDBC pt 15 - Updating rows with ResultSet
//267 - JDBC pt 16 - Inserting and Deleting rows with ResultSet
//268 - JDBC pt 17 - PreparedStatement pt 01
//269 - JDBC pt 18 - PreparedStatement pt 02
//270 - JDBC pt 19 - CallableStatement
//274 - JDBC pt 23 - Transactions


import academy.devdojo.javaoneforall.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.javaoneforall.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }
    public static void delete(Integer id){
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void saveTransaction(List<Producer> producers){
        ProducerRepository.saveTransaction(producers);
    }

    public static void update(Producer producer){
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static void updatePreparedStatement(Producer producer){
        requireValidId(producer.getId());
        ProducerRepository.updatePreparedStatement(producer);
    }

    public static List<Producer> findAll(){
        return ProducerRepository.findAll();
    }

    public static List<Producer> findByName(String name){
        return ProducerRepository.findByName(name);
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name){
        return ProducerRepository.findByNameAndUpdateToUpperCase(name);
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name){
        return ProducerRepository.findByNameAndInsertWhenNotFound(name);
    }

    public static List<Producer> findByNamePreparedStatement(String name){
        return ProducerRepository.findByNamePreparedStatement(name);
    }

    public static List<Producer> findByNameCallableStatement(String name){
        return ProducerRepository.findByNameCallableStatement(name);
    }

    public static void findByNameAndDelete(String name){
        ProducerRepository.findByNameAndDelete(name);
    }

    public static void showResultSetMetaData(){
        ProducerRepository.showResultSetMetaData();
    }

    public static void showDriverMetaData(){
        ProducerRepository.showDriverMetaData();
    }

    public static void showTypeScrollWorking(){
        ProducerRepository.showTypeScrollWorking();
    }

    private static void requireValidId(Integer id){
        if(id == null || id <=0){
            throw  new IllegalArgumentException("Invalid id, is it bigger than 0?");
        }
    }

}
