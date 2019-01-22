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
        String sql = "INSERT INTO vehicles(reg_no,chasis_no,model_no,department,contact_person,fuel_type,odometer_reading,extension) VALUES (?,?,?,?,?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, vehicle.getRegNo());
            statement.setString(2, vehicle.getChasisNo());
            statement.setString(3, vehicle.getModelNo());
            statement.setString(4, vehicle.getDepartment());
            statement.setString(5, vehicle.getContactPerson());
            statement.setString(6, vehicle.getFuelType());
            statement.setString(7, vehicle.getOdometerReading());
            statement.setString(8, vehicle.getExtension());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //fetch allproducts
    public static List<Vehicle> fetchAllProducts(Connection connection) {
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
       String contact_person=resultSet.getString("contact_person");
       String fuel_type=resultSet.getString("fuel_type");
       String odometerReading=resultSet.getString("odometer_reading");
       String extension=resultSet.getString("extension");
       
          
            Vehicle vehicle = new Vehicle(regNo,chasisNo,modelNo,department,contact_person,fuel_type,odometerReading,extension);
            vehicle.setId(resultSet.getInt("id"));

            vehicles.add(vehicle);
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
