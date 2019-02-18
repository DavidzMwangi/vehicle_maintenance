/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.ServicingCard;

/**
 *
 * @author David
 */
public class ServicingCardDao {
      public static void insertDefect(Connection connection,ServicingCard servicingCard){
            
         String sql = "INSERT INTO servicing_card(engine_oil_change,work_order_id,gearbox_oil_level,diff_oil_level, radiator_water_level,"
                 + "power_steering,brake_fluid,clutch_fluid,fan_belt_tension,battery_electrolyte_water,all_lights_checked,"
                 + "battery_terminal_tight_greased,windscreen_wiper_water,engine_oil_level) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setBoolean(1, servicingCard.isEngineOilChange());
                    statement.setInt(2, servicingCard.getWorkOrderId());

                    statement.setBoolean(3, servicingCard.isGearboxOilLevel());
                    statement.setBoolean(4, servicingCard.isDiffOilLevel());
                    statement.setBoolean(5, servicingCard.isRadiatorWaterLevel());
                    statement.setBoolean(6, servicingCard.isPowerSteering());
                    statement.setBoolean(7, servicingCard.isBrakeFluid());
                    statement.setBoolean(8, servicingCard.isClutchFluid());
                    statement.setBoolean(9, servicingCard.isFanBeltTension());
                    statement.setBoolean(10, servicingCard.isBatteryElectrolyteWater());
                    statement.setBoolean(11, servicingCard.isAllLightsChecked());
                    statement.setBoolean(12, servicingCard.isBatteryTerminalTightGrease());
                    
                   statement.setBoolean(13, servicingCard.isWindscreenWiperWater());
                    statement.setBoolean(14, servicingCard.isEngineOilLevel());
          

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
