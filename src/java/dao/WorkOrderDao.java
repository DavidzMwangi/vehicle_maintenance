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
     
     
    public static WorkOrder dataGetting(Connection  connection, int id){
//                String sql="SELECT *  FROM work_order WHERE id=? LIMIT 1 ";
                String sql = "SELECT work_order.id,work_order.work_instructions,work_order.servicing,work_order.confirmed,work_order.completed,work_order.date, vehicles.reg_no,vehicles.chasis_no,vehicles.model_no,vehicles.engine_no,vehicles.department,vehicles.odometer_reading,vehicles.fuel,users.name FROM work_order LEFT JOIN vehicles  ON work_order.vehicle_id=vehicles.id INNER JOIN users ON work_order.mechanic_id=users.id WHERE work_order.id=? LIMIT 1";
      
                WorkOrder order=new WorkOrder();
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setInt(1, id);
            
            ResultSet set=statement.executeQuery();
             while(set.next()){
                 
                 order.setId(set.getInt("id"));
            order.setRegNo(set.getString("reg_no"));
            order.setServicing(set.getBoolean("servicing"));
            order.setCompleted(set.getBoolean("completed"));
            order.setPromisedDate(set.getDate("date"));
            order.setMechanicName(set.getString("name"));
            order.setEngineNumber(set.getInt("engine_no"));
            order.setChasisNumber(set.getString("chasis_no"));
            order.setModelNumber(set.getString("model_no"));
            order.setDepartment(set.getString("department"));
            order.setFuel(set.getDouble("fuel"));
            order.setOdometerReading(set.getInt("odometer_reading"));
            order.setWorkInstructions(set.getString("work_instructions"));
             }
            
        }catch(Exception e){
                        e.printStackTrace();


        }
        return order;
        
    }
}
