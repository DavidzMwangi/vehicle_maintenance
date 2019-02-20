/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UsersDao;
import dao.VehicleDao;
import dao.WorkOrderDao;

import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import model.User;
import model.Vehicle;
import model.WorkOrder;
/**
 *
 * @author David
 */
public class WorkOrderServlet extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int vehicleId = Integer.valueOf(request.getParameter("vehicleId"));
        int vehicleOdometer = Integer.parseInt(request.getParameter("vehicleOdometer"));
        double vehicleFuel = Double.parseDouble(request.getParameter("vehicleFuel"));

//        String contact = request.getParameter("contact");
        String ptime = request.getParameter("ptime");

        String instruction = request.getParameter("instruction");

        System.out.println(ptime);

        String[] dateToken = ptime.split("-");
        int year = Integer.valueOf(dateToken[0]);
        int month = Integer.valueOf(dateToken[1]);
        int day = Integer.valueOf(dateToken[2]);

        Calendar c = Calendar.getInstance();
        c.set(year, month, day);

        int mechanicId = Integer.valueOf(request.getParameter("mechanicId"));
        boolean isServicing = Integer.valueOf(request.getParameter("servicing")) == 1;

        Vehicle vehicle = new Vehicle();
        vehicle.setId(vehicleId);
        vehicle.setOdometerReading(vehicleOdometer);
        vehicle.setFuel(vehicleFuel);

        Connection connection = db.DBConnection.getConnection();
        VehicleDao.updateVehicle(connection, vehicle);

        WorkOrder workOrder = new WorkOrder(vehicleId, mechanicId, instruction, isServicing, c.getTime());
        WorkOrderDao.insertVehicle(connection, workOrder);

//        response.sendRedirect("/GroupProject/foreman/index.jsp?status=success");
            response.sendRedirect("/GroupProject/ShowWorkOrders");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String status = request.getParameter("status");

        String url = "/foreman/workorder.jsp";

        Connection connection = db.DBConnection.getConnection();

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        List<Vehicle> vehicles = VehicleDao.fetchAllVehicle(connection);
        List<User> mechanics = UsersDao.fetchMechanics(connection);

        request.setAttribute("vehicles", vehicles);
        request.setAttribute("mechanics", mechanics);
        request.setAttribute("status", status);

        dispatcher.forward(request, response);

    }
}
