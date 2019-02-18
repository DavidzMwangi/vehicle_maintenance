/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.CheckListDao;
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
import model.CheckList;
import model.WorkOrder;

/**
 *
 * @author David
 */
public class AddChecklistServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            //handles displaying the ui for adding the checklist
        int workOrderId=Integer.parseInt(request.getParameter("work_order_id"));
         String url = "/mechanic/addChecklist.jsp";
         
         request.setAttribute("work_order_id",workOrderId);
         RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(url);
         
         dispatcher.forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //handles the saving of the checklist
        boolean jack=request.getParameter("jack")!=null;
        boolean jackHandle=request.getParameter("jack_handle")!=null;
        boolean spareWheel=request.getParameter("spare_wheel")!=null;
        boolean radio=request.getParameter("radio")!=null;
        boolean wheelSpanner=request.getParameter("wheel_spanner")!=null;
        boolean radioCassette=request.getParameter("radio_casette")!=null;
        boolean radioSpeaker=request.getParameter("radio_speaker")!=null;
        boolean wheelCaps=request.getParameter("wheel_caps")!=null;
        boolean mirrors=request.getParameter("mirrors")!=null;
        boolean radioAntenna=request.getParameter("radio_antenna")!=null;
        int workOrderId=Integer.parseInt(request.getParameter("work_order_id"));
        
        //insert to the db     
         CheckList checklist=new CheckList();
         checklist.setJack(jack);
         checklist.setJackHandle(jackHandle);
         checklist.setSpareWheel(spareWheel);
         checklist.setRadio(radio);
         checklist.setRadioCassette(radioCassette);
         checklist.setWheelSpanner(wheelSpanner);
         checklist.setRadioSpeaker(radioSpeaker);
         checklist.setWheelCaps(wheelCaps);
         checklist.setMirrors(mirrors);
         checklist.setRadioAntenna(radioAntenna);
         checklist.setWorkOrderId(workOrderId);
         
         
         Connection connection=DBConnection.getConnection();
         CheckListDao.insertCheckList(connection,checklist);
         
       String url = "/mechanic/viewWorkOrders.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        List<WorkOrder> workorder = WorkOrderDao.mechanicWorkOrders(connection,1);

        request.setAttribute("workorders", workorder);
          request.setAttribute("number",20);
        dispatcher.forward(request, response);
         
         


    }

}
