package org.hooks.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
    public static Connection getConnection() {

        try{
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String user="postgres";
            String password="Test@123";

            return DriverManager.getConnection(url,user,password);
        }catch (ClassNotFoundException classNotFoundException){
            classNotFoundException.printStackTrace();
            return null;
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            return null;
        }

    }
}
