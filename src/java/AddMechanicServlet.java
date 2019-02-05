/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.UsersDao;
import dao.VehicleDao;
import db.DBConnection;
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
 * @author mwang
 */
public class AddMechanicServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = "/foreman/addMechanic.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(path);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
          String fullName=request.getParameter("name");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        
           User user = new User(email, fullName, 0, password);

        Connection connection = DBConnection.getConnection();
        UsersDao.insertProduct(connection, user);
        
        
         String url = "/foreman/allMechanics.jsp";


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        List<User> mechanics = UsersDao.fetchMechanics(connection);

        request.setAttribute("mechanics", mechanics);

        dispatcher.forward(request, response);
   dispatcher.forward(request, response);
        
    }

  
}
