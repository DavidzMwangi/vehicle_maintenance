/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.AdditionalDefectDao;
import dao.WorkOrderDao;
import db.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AdditionalDefect;
import model.WorkOrder;
import java.sql.Connection;
import javax.servlet.http.HttpSession;

/**
 *
 * @author David
 */
public class AddAdditionalDefectsServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                //open the jsp page
              String url = "/mechanic/additionalDefects.jsp";
         
         request.setAttribute("work_order_id",Integer.parseInt(request.getParameter("work_order_id")));
         RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(url);
         
         dispatcher.forward(request, response);
                

    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        int workOrderId=Integer.parseInt(request.getParameter("work_order_id"));
        String name=request.getParameter("name");
                
        AdditionalDefect additional=new AdditionalDefect();
        
        additional.setName(name);
        additional.setWorkOrderId(workOrderId);
        
        Connection connection=DBConnection.getConnection();
        AdditionalDefectDao.insertDefect(connection, additional);
        
        
        
        
        HttpSession session = request.getSession();
        String url = "/mechanic/viewWorkOrders.jsp";
        String mechan =  (String)session.getAttribute("userName");
        if (mechan == null) {

            String url_login = "/index.jsp";
            RequestDispatcher dispatcher2 = getServletContext().getRequestDispatcher(url_login);
            dispatcher2.forward(request, response);

        }else{
                int   mechanic_id = (Integer) session.getAttribute("userId");


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        List<WorkOrder> workorder = WorkOrderDao.mechanicWorkOrders(connection, mechanic_id);

        request.setAttribute("workorders", workorder);
        request.setAttribute("number", 20);
        dispatcher.forward(request, response);
        }
        
        
//        
//         String url = "/mechanic/viewWorkOrders.jsp";
//
//
//        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
//        List<WorkOrder> workorder = WorkOrderDao.mechanicWorkOrders(connection,1);
//
//        request.setAttribute("workorders", workorder);
//        dispatcher.forward(request, response);
//        
//        
    }

   
}
