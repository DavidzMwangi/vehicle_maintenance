/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import model.WorkOrder;

public class WorkOrderDao {

    //create a new product
    public static void insertVehicle(Connection connection, WorkOrder workOrder) {
        String sql = "INSERT INTO word_order(vehicle_id, contact, work_instructions, mechanic_id, servicing, date) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, workOrder.getVehicleId());
            statement.setString(2, workOrder.getContact());
            statement.setString(3, workOrder.getWorkInstructions());
            statement.setInt(4, workOrder.getMechanicId());
            statement.setBoolean(5, workOrder.isServicing());
            statement.setTimestamp(6, new Timestamp(workOrder.getPromisedDate().getTime()));

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
