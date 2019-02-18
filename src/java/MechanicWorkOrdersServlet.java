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
import java.util.List;
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
public class MechanicWorkOrdersServlet extends HttpServlet {

  

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            doPost(request, response);

    }

   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session=request.getSession();
             String url = "/mechanic/viewWorkOrders.jsp";
        int mechanic_id =(Integer) session.getAttribute("userId");
        Connection connection = DBConnection.getConnection();

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        List<WorkOrder> workorder = WorkOrderDao.mechanicWorkOrders(connection,mechanic_id);

        request.setAttribute("workorders", workorder);
          request.setAttribute("number",20);
        dispatcher.forward(request, response);
    }

   
    

}
