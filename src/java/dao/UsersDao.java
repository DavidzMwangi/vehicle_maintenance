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
import model.User;
import model.Vehicle;

/**
 *
 * @author mwang
 */
public class UsersDao {

    public static void insertProduct(Connection connection, User user) {
        String sql = "INSERT INTO users(name,email,password,user_type) VALUES (?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
          statement.setString(1, user.getName());
           statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setInt(4, user.getUser_type());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //fetch allproducts
    public static List<User> fetchMechanics(Connection connection) {
        String sql = "SELECT * FROM users WHERE user_type=? ";
        List<User> mechanics = null;
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, 0);
            ResultSet resultSet = statement.executeQuery();
            mechanics = new ArrayList<>();
            setUsers(mechanics, resultSet);
            return mechanics;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void setUsers(List<User> mechanics, ResultSet resultSet) throws SQLException {

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String email = resultSet.getString("email");
            String name=resultSet.getString("name");
            String password = resultSet.getString("password");
            int user_type = resultSet.getInt("user_type");


            User user = new User(id,name, email, user_type, password);
            mechanics.add(user);
        }
    }
}
