/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.UsersDao;
import dao.VehicleDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;
import model.Vehicle;

/**
 *
 * @author David
 */
public class AllMechanicsServlet extends HttpServlet {

   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        
        
           String url = "/foreman/allMechanics.jsp";

        Connection connection = db.DBConnection.getConnection();

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        List<User> mechanics = UsersDao.fetchMechanics(connection);

        request.setAttribute("mechanics", mechanics);

        dispatcher.forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
