/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.WorkOrderDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.WorkOrder;

/**
 *
 * @author David
 */
public class MoreWorkOrderServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    int workorder =Integer.parseInt (request.getParameter("work_order_id"));
                       String url = "/foreman/moreWorkorder.jsp";

      
     Connection connection = db.DBConnection.getConnection();
     
    WorkOrder workorderModel=   WorkOrderDao.dataGetting(connection, workorder);
    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
   
    request.setAttribute("workOrder", workorderModel);

    dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

  
}
