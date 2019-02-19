/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utlls.SessionUtil;

/**
 *
 * @author David
 */
public class LogoutServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        //remove the session
//          Cookie cookie =SessionUtil.getCookie(request,"userCookie");
//        if(cookie != null){
//            cookie.setMaxAge(0);
//            response.addCookie(cookie);
//        }
        SessionUtil.removeUserSession(request);
        
        
        String url="/index.jsp";
        RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
