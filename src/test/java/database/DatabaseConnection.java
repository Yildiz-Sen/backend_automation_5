package database;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) throws SQLException {

        /**
         * In order to connect to the DB we need our URL, username, password, and query
         *
         */

        String url = "jdbc:oracle:thin:@techglobal.cup7q3kvh5as.us-east-2.rds.amazonaws.com:1521/TGDEVQA";
        String username = "yildiz";
        String password = "$yildiz123!";
        String query = "select * from employees";

        //create a connection to the db with the parameters we stored
        Connection connection = DriverManager.getConnection(url, username, password);

        System.out.println("Database connection is successful");

        //statement keeps the connection between db and automation to send queries
        Statement statement = connection.createStatement();

        //ResultSet is sending the query to the db and get the result
        ResultSet resultSet = statement.executeQuery(query);

        //ResultSetMetaData gives the information about the table
        //you cant simply print the column values, we need to call with iterators
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

        System.out.println("Number of the columns = " + resultSetMetaData.getColumnCount());
        System.out.println("Column name = " +resultSetMetaData.getColumnName(1));

        while(resultSet.next()){
            System.out.println(resultSet.getString("FIRST_NAME"));
            System.out.println(resultSet.getString("LAST_NAME"));
        }


    }
}
