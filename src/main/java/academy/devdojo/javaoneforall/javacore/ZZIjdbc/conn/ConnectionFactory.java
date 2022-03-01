package academy.devdojo.javaoneforall.javacore.ZZIjdbc.conn;

//255 - JDBC pt 04 - Installing and adding Maven to the project
//256 - JDBC pt 05 - Adding dependency and connecting to the database
//257 - JDBC pt 06 - Inserting data with Statement
//271 - JDBC pt 20 - Connected RowSet - JdbcRowSet pt 01
//273 - JDBC pt 22 - Disconnected RowSet - CachedRowSet

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
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

    public static JdbcRowSet getJdbcRowSet() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "root";
        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        jdbcRowSet.setUrl(url);
        jdbcRowSet.setUsername(username);
        jdbcRowSet.setPassword(password);
        return jdbcRowSet;
    }

    public static CachedRowSet getCachedRowSet() throws SQLException {
        return RowSetProvider.newFactory().createCachedRowSet();
    }
}
