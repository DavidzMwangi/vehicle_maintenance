/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.SpareDao;
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
import model.Spare;

/**
 *
 * @author David
 */
public class ApproveSpareServlet extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int spareId=Integer.parseInt(request.getParameter("spare_id"));
        int workOrderId=Integer.parseInt(request.getParameter("work_order_id"));
        String url = "/foreman/viewSpares.jsp";

        Connection connection=DBConnection.getConnection();
        //update the record
        SpareDao.approveSpare(connection,spareId);
        
        //redirect back to that page where the user was
        List<Spare> spares=SpareDao.fetchSpares(connection, workOrderId);
        
        RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(url);
       
        request.setAttribute("spares",spares);
        
        dispatcher.forward(request, response);
    }

}
