package academy.devdojo.javaoneforall.javacore.ZZIjdbc.conn;

//255 - JDBC pt 04 - Installing and adding Maven to the project
//256 - JDBC pt 05 - Adding dependency and connecting to the database
//257 - JDBC pt 06 - Insering data with Statement

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Checked if Maven was installed
 * Go to Maven Repository and look for 'mysql', it should be installed the same
 * version the docker is running (you can check it when you run docker 'docker-
 * compose up')
 */

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "root";

        return DriverManager.getConnection(url, username, password);

    }
}
