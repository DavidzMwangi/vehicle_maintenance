/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utlls;

import dao.WorkOrderDao;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.WorkOrder;

/**
 *
 * @author David
 */
public class WorkOrderRedirector {
    public static void redirectMechanicWorkOrder(HttpServletRequest request,HttpServletResponse response,int workOrderId){
        
        
        
//        String url = "/mechanic/viewWorkOrders.jsp";
//
//        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
//        List<WorkOrder> workorder = WorkOrderDao.mechanicWorkOrders(connection,1);
//
//        request.setAttribute("workorders", workorder);
//          request.setAttribute("number",20);
//        dispatcher.forward(request, response);
    }
}
