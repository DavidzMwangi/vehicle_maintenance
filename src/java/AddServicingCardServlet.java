/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.ServicingCardDao;
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
import model.ServicingCard;
import model.WorkOrder;

/**
 *
 * @author David
 */
public class AddServicingCardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
             //handles displaying the ui for adding the checklist
        int workOrderId=Integer.parseInt(request.getParameter("work_order_id"));
         String url = "/mechanic/addServicingCard.jsp";
         
         request.setAttribute("work_order_id",workOrderId);
         RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(url);
         
         dispatcher.forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //save the service card
        boolean engineOilChange=request.getParameter("engine_oil_change")!=null;
        boolean gearboxOilLevel=request.getParameter("gearbox_oil_level")!=null;
        boolean diffOilLevel=request.getParameter("diff_oil_level")!=null;
        boolean radiatorWaterLevel=request.getParameter("radiator_water_level")!=null;
        boolean powerSteering=request.getParameter("power_steering")!=null;
        boolean brakeFluid=request.getParameter("brake_fluid")!=null;
        boolean clutchFluid=request.getParameter("clutch_fluid")!=null;
        boolean fanBeltTension=request.getParameter("fan_belt_tension")!=null;
        boolean batteryElectrolyteWater=request.getParameter("battery_electrolyte_water")!=null;
        boolean allLightsChecked=request.getParameter("all_lights_checked")!=null;
        boolean batteryTerminalTightGrease=request.getParameter("battery_terminal_tight_greased")!=null;
        boolean windscreenWiperWater=request.getParameter("windscreen_wiper_water")!=null;
        int workOrderId=Integer.parseInt(request.getParameter("work_order_id"));
        boolean engineOilLevel=request.getParameter("engine_oil_level")!=null;
        
        //insert to the model
        ServicingCard card=new ServicingCard();
        card.setEngineOilChange(engineOilChange);
        card.setEngineOilLevel(engineOilLevel);
        card.setGearboxOilLevel(gearboxOilLevel);
        card.setDiffOilLevel(diffOilLevel);
        card.setAllLightsChecked(allLightsChecked);
        card.setRadiatorWaterLevel(radiatorWaterLevel);
        card.setPowerSteering(powerSteering);
        card.setBrakeFluid(brakeFluid);
        card.setClutchFluid(clutchFluid);
        card.setFanBeltTension(fanBeltTension);
        card.setBatteryElectrolyteWater(batteryElectrolyteWater);
        card.setBatteryTerminalTightGrease(batteryTerminalTightGrease);
        card.setWindscreenWiperWater(windscreenWiperWater);
        card.setWorkOrderId(workOrderId);
        
        //assign to the workdao
        Connection connection=DBConnection.getConnection();
        ServicingCardDao.insertDefect(connection, card);
        
        
         String url = "/mechanic/viewWorkOrders.jsp";


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        List<WorkOrder> workorder = WorkOrderDao.mechanicWorkOrders(connection,1);

        request.setAttribute("workorders", workorder);
        dispatcher.forward(request, response);
        
    }

}
