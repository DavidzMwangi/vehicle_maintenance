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
import model.Vehicle;

/**
 *
 * @author mwang
 */
public class VehicleDao {
    
    
     //create a new product
    public static void insertProduct(Connection connection, Vehicle vehicle) {
        String sql = "INSERT INTO vehicles(reg_no,chasis_no,model_no,department,engine_no,fuel,odometer_reading) VALUES (?,?,?,?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, vehicle.getRegNo());
            statement.setString(2, vehicle.getChasisNo());
            statement.setString(3, vehicle.getModelNo());
            statement.setString(4, vehicle.getDepartment());
            statement.setInt(5, vehicle.getEngineNo());
            statement.setDouble(6, vehicle.getFuel());
            statement.setInt(7, vehicle.getOdometerReading());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //fetch allproducts
    public static List<Vehicle> fetchAllVehicle(Connection connection) {
        String sql = "SELECT * FROM vehicles";
        List<Vehicle> vehicles = null;
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            vehicles = new ArrayList<>();
            setVehicles(vehicles, resultSet);
            return vehicles;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }



   

    private static void setVehicles(List<Vehicle> vehicles, ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {

            
              String regNo=resultSet.getString("reg_no");
       String chasisNo=resultSet.getString("chasis_no");
       String modelNo=resultSet.getString("model_no");
       String department=resultSet.getString("department");
       int engine_no=resultSet.getInt("engine_no");
       Double fuel=resultSet.getDouble("fuel");
       int odometerReading=resultSet.getInt("odometer_reading");
       
          
       Vehicle vehicle=new Vehicle(regNo, engine_no, chasisNo, modelNo, department, fuel, odometerReading);
       vehicle.setId(resultSet.getInt("id"));

            vehicles.add(vehicle);
        }
    }

  public static Vehicle fetchVehicle(Connection connection, int id){
        String sql = "SELECT * FROM vehicles WHERE id=?";
        Vehicle vehicle = null;
        try (PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                vehicle = new Vehicle();
                vehicle.setId(id);
                vehicle.setRegNo(resultSet.getString("reg_no"));
                vehicle.setChasisNo(resultSet.getString("chasis_no"));
                vehicle.setModelNo(resultSet.getString("model_no"));
                vehicle.setDepartment(resultSet.getString("department"));
                vehicle.setFuel(resultSet.getDouble("fuel_type"));
                vehicle.setEngineNo(resultSet.getInt("engine_no"));
                vehicle.setOdometerReading(resultSet.getInt("odometer_reading"));
                
            }
            
        }catch(SQLException e) {
            e.printStackTrace();
           
        }
        
        return vehicle;
    }

  
  
  public static void updateVehicle(Connection connection, Vehicle vehicle){
        String sql = "UPDATE vehicles set odometer_reading=?, fuel=? where id=? ";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, vehicle.getOdometerReading());
            statement.setDouble(2, vehicle.getFuel());
            statement.setInt(3, vehicle.getId());
            
            statement.executeUpdate();
   
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  
    //delete a product

    public static void deleteProduct(Connection connection, String code) {
        String sql = "DELETE FROM vehicles WHERE code=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, code);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
