/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.VehicleDao;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Vehicle;
import com.google.gson.Gson;

/**
 *
 * @author David
 */
public class GetVehicleDetailsServlet extends HttpServlet {

    


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.valueOf(request.getParameter("id"));
        
        Connection connection = db.DBConnection.getConnection();
        Vehicle vehicle = VehicleDao.fetchVehicle(connection, id);
        String json ="{}";
        if(vehicle != null){
            json = new Gson().toJson(vehicle);
        }
      
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);

    }

}
