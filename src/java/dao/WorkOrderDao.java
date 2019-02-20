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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import model.WorkOrder;

public class WorkOrderDao {

    //create a new product
    public static void insertVehicle(Connection connection, WorkOrder workOrder) {
        String sql = "INSERT INTO work_order(vehicle_id, work_instructions, mechanic_id, servicing, date,vehicle_condition) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, workOrder.getVehicleId());
            statement.setString(2, workOrder.getWorkInstructions());
            statement.setInt(3, workOrder.getMechanicId());
            statement.setBoolean(4, workOrder.isServicing());
            statement.setTimestamp(5, new Timestamp(workOrder.getPromisedDate().getTime()));
            statement.setString(6,"vehicle_condition");
            
            
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    
     public static List<WorkOrder> fetchWorkOrder(Connection connection){

         String sql="SELECT work_order.id,work_order.created_at,work_order.work_instructions,work_order.servicing,work_order.completed,vehicles.reg_no FROM work_order LEFT JOIN vehicles  ON work_order.vehicle_id=vehicles.id";

        
         List<WorkOrder> workorder = null;
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            workorder= new ArrayList<>();
            setWorkOrder(workorder, resultSet);
            return workorder;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        
    }
     private static void setWorkOrder(List<WorkOrder> workorders, ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {

           
       WorkOrder workorder=new WorkOrder();
       workorder.setId(resultSet.getInt("id"));
       workorder.setCreatedAt(resultSet.getString("created_at"));
       workorder.setRegNo(resultSet.getString("reg_no"));
      workorder.setServicing(resultSet.getBoolean("servicing"));
       workorder.setWorkInstructions(resultSet.getString("work_instructions"));
       workorder.setCompleted(resultSet.getBoolean("completed"));

            workorders.add(workorder);
        }
    }
     
     
     public static List<WorkOrder> mechanicWorkOrders(Connection connection,int mechanic_id){
         
//         String sql="SELECT * FROM work_order WHERE mechanic_id =?";
                 String sql="SELECT work_order.id,work_order.created_at,work_order.work_instructions,work_order.servicing,work_order.completed,vehicles.reg_no FROM work_order  LEFT JOIN vehicles  ON work_order.vehicle_id=vehicles.id WHERE work_order.mechanic_id =?";

         List<WorkOrder> workOrders=null;
         try (PreparedStatement statement = connection.prepareStatement(sql)){
               statement.setInt(1, mechanic_id);
               ResultSet resultSet = statement.executeQuery();
            workOrders= new ArrayList<>();
            setWorkOrder(workOrders, resultSet);
            return workOrders;
               
         }catch(SQLException e){
             e.printStackTrace();
             return null;
         }
     }
     
     public static void markCompleted(Connection connection,int workOrderId) throws SQLException {
       
         String sql="UPDATE work_order set completed=? where id=?";
         try(PreparedStatement statement=connection.prepareStatement(sql)){
             statement.setBoolean(1, true);
             statement.setInt(2,workOrderId);
             statement.executeUpdate();
             
         }catch(SQLException e){
             e.printStackTrace();
         }
         
    }
}
