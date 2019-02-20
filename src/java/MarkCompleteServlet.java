/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.WorkOrderDao;
import db.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.WorkOrder;

/**
 *
 * @author David
 */
public class MarkCompleteServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int work_order_id=Integer.parseInt(request.getParameter("work_order_id"));
  
        Connection connection = DBConnection.getConnection();        
        try {
            WorkOrderDao.markCompleted(connection, work_order_id);
//        WorkOrderDao.markCompleted(connection,work_order_id);
        } catch (SQLException ex) {
            Logger.getLogger(MarkCompleteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        HttpSession session = request.getSession();
        String url = "/mechanic/viewWorkOrders.jsp";
        String mechan =  (String)session.getAttribute("userName");
        if (mechan == null) {

            String url_login = "/index.jsp";
            RequestDispatcher dispatcher2 = getServletContext().getRequestDispatcher(url_login);
            dispatcher2.forward(request, response);

        }else{
                int   mechanic_id = (Integer) session.getAttribute("userId");

//            Connection connection = DBConnection.getConnection();

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        List<WorkOrder> workorder = WorkOrderDao.mechanicWorkOrders(connection, mechanic_id);

        request.setAttribute("workorders", workorder);
        request.setAttribute("number", 20);
        dispatcher.forward(request, response);
        }
        
//        String url = "/mechanic/viewWorkOrders.jsp";
//
//        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
//        List<WorkOrder> workorder = WorkOrderDao.mechanicWorkOrders(connection,1);
//
//        request.setAttribute("workorders", workorder);
//          request.setAttribute("number",20);
//        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


}
