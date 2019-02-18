/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
*/

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;
import dao.UsersDao;
import db.DBConnection;
import javax.servlet.http.Cookie;
import utlls.SessionUtil;
/**
 *
 * @author David
 */
public class AuthRegisterServlet extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("username");
        String email = request.getParameter("Email");
        String password = request.getParameter("password");
        int userType = Integer.parseInt(request.getParameter("user_type"));

        String errorMessage = null;
        String redirectUrl = "";
User user=null;
        //validate user inputs
        if (name == null || email == null || password == null
                || name.length() == 0 || email.length() == 0 || password.length() == 0) {
            //all values are required
            errorMessage = "All values are required";
            redirectUrl = "/GroupProject/signup.jsp";
        } else {
            //connect to database
                    user = new User(name, email, password, userType);

            Connection connection = DBConnection.getConnection();
            UsersDao.insertUser(connection, user);
            
            
             
          //set session here
          SessionUtil.setUserSession(request, user);
          
          //set cookie
            Cookie userCookie = new Cookie("userCookie", user.getName());
                userCookie.setMaxAge(24 * 60 * 60 * 30); //2 days
                userCookie.setPath("/");
              response.addCookie(userCookie);
              

        }
        //if error redirect back
        if (errorMessage != null) {
            request.setAttribute("error", errorMessage);
            request.setAttribute("user", user);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(redirectUrl);
            dispatcher.forward(request, response);
        } //else redirect to login
        else {
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}