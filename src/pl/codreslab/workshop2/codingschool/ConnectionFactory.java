package pl.codreslab.workshop2.codingschool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {

    public static Connection getConnection(String dbUsername, String dbPassword, String dbName) throws SQLException {
        String connectionString = "jdbc:mysql://localhost:3306/" + dbName + "?useSSL=false&serverTimezone=UTC";
        return DriverManager.getConnection(connectionString, dbUsername, dbPassword);
    }
}


