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
import model.AdditionalDefect;

/**
 *
 * @author David
 */
public class AdditionalDefectDao {
        public static List<AdditionalDefect> fetchAdditionalDefects(Connection connection,int workOrderId) {
        String sql = "SELECT * FROM additional_defects WHERE work_order_id=? ";
        List<AdditionalDefect> additonalDefects = null;
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, workOrderId);
            ResultSet resultSet = statement.executeQuery();
            additonalDefects = new ArrayList<>();
            setAdditionalDefects(additonalDefects, resultSet);
            return additonalDefects;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
      
}
        }
        
          private static void setAdditionalDefects(List<AdditionalDefect> additionalDefects, ResultSet resultSet) throws SQLException {

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            boolean approved=resultSet.getBoolean("approved");
            int workOrderId = resultSet.getInt("work_order_id");
               

            AdditionalDefect additionalDefect=new AdditionalDefect(id,name,approved,workOrderId);
            additionalDefects.add(additionalDefect);
        }
    }

    public static void approveDefect(Connection connection, int defectId) {

                
  String sql="UPDATE additional_defects set approved=? where id=?";
        try(PreparedStatement statement=connection.prepareStatement(sql)){
            statement.setBoolean(1, true);
            statement.setInt(2,defectId);
            
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
            
    }
}
