/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.CheckList;

/**
 *
 * @author David
 */
public class CheckListDao {
      public static void insertCheckList(Connection connection, CheckList checklist) {
        String sql = "INSERT INTO item_checklist(work_order_id,jack,jack_handle,spare_wheel,wheel_spanner,radio,radio_cassette,radio_antenna,radio_speaker,wheel_caps,mirrors) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, checklist.getWorkOrderId());
            statement.setBoolean(2, checklist.isJack());
            statement.setBoolean(3,checklist.isJackHandle());
            statement.setBoolean(4, checklist.isSpareWheel());
            statement.setBoolean(5, checklist.isWheelSpanner());
            statement.setBoolean(6, checklist.isRadio());
            statement.setBoolean(7, checklist.isRadioCassette());
            statement.setBoolean(8, checklist.isRadioAntenna());
            statement.setBoolean(9, checklist.isRadioSpeaker());
            statement.setBoolean(10, checklist.isWheelCaps());
             statement.setBoolean(11, checklist.isMirrors());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
