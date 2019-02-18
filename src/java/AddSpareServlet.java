/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.AdditionalDefectDao;
import dao.SpareDao;
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
import model.AdditionalDefect;
import model.Spare;
import model.WorkOrder;

/**
 *
 * @author David
 */
public class AddSpareServlet extends HttpServlet {


   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            //open the jsp page
              String url = "/mechanic/addSparePart.jsp";
         
         request.setAttribute("work_order_id",Integer.parseInt(request.getParameter("work_order_id")));
         RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(url);
         
         dispatcher.forward(request, response);
                
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

 int workOrderId=Integer.parseInt(request.getParameter("work_order_id"));
        String name=request.getParameter("name");
                
        Spare spare=new Spare();
        
        spare.setName(name);
        spare.setWorkOrderId(workOrderId);
        
        Connection connection=DBConnection.getConnection();
        SpareDao.insertSpare(connection, spare);
        
        
         String url = "/mechanic/addSparePart.jsp";
         
         request.setAttribute("work_order_id",workOrderId);
         RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(url);
         
         dispatcher.forward(request, response);
         
    
        
    }


}
