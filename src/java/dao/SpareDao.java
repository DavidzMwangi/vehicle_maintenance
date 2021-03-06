/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Spare;

/**
 *
 * @author David
 */
public class SpareDao {
      public static List<Spare> fetchSpares(Connection connection,int workOrderId) {
        String sql = "SELECT * FROM spares WHERE work_order_id=? ";
        List<Spare> spares = null;
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, workOrderId);
            ResultSet resultSet = statement.executeQuery();
            spares = new ArrayList<>();
            setSpares(spares, resultSet);
            return spares;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
      
        private static void setSpares(List<Spare> spares, ResultSet resultSet) throws SQLException {

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            boolean isApproved=resultSet.getBoolean("is_approved");
            int workOrderId = resultSet.getInt("work_order_id");
               

           Spare spare=new Spare(id,name,isApproved,workOrderId);
            spares.add(spare);
        }
    }

    public static void approveSpare(Connection connection, int spareId) {

        String sql="UPDATE spares set is_approved=? where id=?";
        try(PreparedStatement statement=connection.prepareStatement(sql)){
            statement.setBoolean(1, true);
            statement.setInt(2,spareId);
            
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
            
    }
    
       public static void insertSpare(Connection connection,Spare spare){
        
        
         String sql = "INSERT INTO spares(name,work_order_id) VALUES (?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
          statement.setString(1, spare.getName());
           statement.setInt(2, spare.getWorkOrderId());
            

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
