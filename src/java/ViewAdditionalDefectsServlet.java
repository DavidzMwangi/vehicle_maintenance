/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.AdditionalDefectDao;
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

/**
 *
 * @author David
 */
public class ViewAdditionalDefectsServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             int workOrderId=Integer.parseInt(request.getParameter("work_order_id"));
                 String url = "/foreman/additionalDefects.jsp";
                 
                 Connection connection=DBConnection.getConnection();
                 List<AdditionalDefect> defects=AdditionalDefectDao.fetchAdditionalDefects(connection, workOrderId);
                 
                 request.setAttribute("defects",defects);
                 RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(url);
                 dispatcher.forward(request, response);
    }


   
}
