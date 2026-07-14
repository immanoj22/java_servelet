package org.hooks.db;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertData {
    public boolean InsertNewUser(String name,String city,int age){
        try(Connection connection=GetConnection.getConnection()){
            PreparedStatement state=connection.prepareStatement("INSERT INTO studentinfo VALUES (?,?,?,?)");
            state.setInt(1,4);
            state.setString(2,name);
            state.setInt(3,age);
            state.setString(4,city);

            int rowsAffected= state.executeUpdate();
            return rowsAffected > 0;
        }catch (Exception e){
            return false;
        }

    }
}
