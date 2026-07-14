package db_hooks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Db_hook {
    public static Connection getDbConnection(){

        try{
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String user="postgres";
            String password="Test@123";

            return DriverManager.getConnection(url,user,password);

        }catch (ClassNotFoundException exception){
            exception.printStackTrace();
            return null;
        }catch (SQLException exception){
            exception.printStackTrace();
            return null;
        }

    }

    public int insertNewUSer(String name,String citym,int age,int id){
        try(Connection connect=Db_hook.getDbConnection()){
            PreparedStatement statement=connect.prepareStatement("insert into studentinfo values(?,?,?,?)");

            statement.setInt(1,id);
            statement.setString(2,name);
            statement.setInt(3,age);
            statement.setString(4,citym);

            int rowsAffected=statement.executeUpdate();

            statement.close();

            return rowsAffected;
        }catch (SQLException exception){
            exception.printStackTrace();
            return 0;
        }
    }
}
