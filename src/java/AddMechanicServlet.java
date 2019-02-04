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

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = "/foreman/addMechanic.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(path);
        dispatcher.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
//        response.sendRedirect("http://localhost:8084/GroupProject/foreman/allMechanics.jsp");

//         String path = "/allMechanics.jsp";
//        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(path);
//        dispatcher.forward(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
