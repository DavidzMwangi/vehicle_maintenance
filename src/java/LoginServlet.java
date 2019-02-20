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



import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import dao.UsersDao;
import db.DBConnection;
import javax.servlet.http.Cookie;
import model.User;
import utlls.SessionUtil;
/**
 *
 * @author David
 */
public class LoginServlet extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    String name = request.getParameter ("username");
    //String email = request.getParameter ("Email");
    String password = request.getParameter("password");
    String errorMessage = null;
    String redirectUrl = "";
    
    
    
    //validate user inputs
      if (name == null || password == null ||
                name.length() == 0 || password.length() == 0) {
            //all values are required
            errorMessage = "All values are required";
            redirectUrl = "/index.jsp";
            request.setAttribute("error", errorMessage);

      } else {
          User user=new User(name,password);
        //connect to database
        Connection connection = DBConnection.getConnection();
      User foundUser= UsersDao.findUser(connection, user);
      
      if(foundUser!=null){
          //we have the  user
          
          //set session here
          SessionUtil.setUserSession(request, foundUser);
          
          //set cookie
            Cookie userCookie = new Cookie("userCookie", user.getName());
                userCookie.setMaxAge(24 * 60 * 60 * 30); //2 days
                userCookie.setPath("/");
              response.addCookie(userCookie);

          if(foundUser.getUser_type()==1){
              redirectUrl="/foreman/index.jsp";
          }else{
              
              //to be done once we strt the mechanic module
               redirectUrl="/mechanic/index.jsp";
              
          }
          
          
          request.setAttribute("user",foundUser);
      }else{
          
          //user  not found
          
        errorMessage = "The user does not exist in the system. Please signup";
            redirectUrl = "/foreman/signup.jsp";
//                        redirectUrl = "/GroupProject/foreman/signup.jsp";

            request.setAttribute("error", errorMessage);

      }
      }
          RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(redirectUrl);

            dispatcher.forward(request, response);

}

}
 
