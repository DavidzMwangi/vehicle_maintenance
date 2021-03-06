/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mumo
 */
public class WorkOrder implements Serializable {

    private int id;
    private int vehicleId;
    private int mechanicId;
    private String workInstructions;
    private boolean servicing;
    private boolean completed;
    private boolean confirmed;
    private String createdAt;
    private String regNo;

    
    private Date promisedDate;
    private String mechanicName;
    private int engineNumber;
    private String chasisNumber;
    private String modelNumber;
    private String department;
    private double fuel;
    private int odometerReading;
    
    
    public String getMechanicName() {
        return mechanicName;
    }

    public void setMechanicName(String mechanicName) {
        this.mechanicName = mechanicName;
    }

    public int getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(int engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getChasisNumber() {
        return chasisNumber;
    }

    public void setChasisNumber(String chasisNumber) {
        this.chasisNumber = chasisNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

   
    

    
    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    

    public WorkOrder() {
    }

    public WorkOrder(int vehicleId, int mechanicId, String workInstructions, boolean servicing, Date promisedDate) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.mechanicId = mechanicId;
        this.workInstructions = workInstructions;
        this.servicing = servicing;
        this.promisedDate = promisedDate;
    }

    public WorkOrder(int vehicleId, int mechanicId, String workInstructions, boolean servicing, boolean confirmed, boolean completed, Date promisedDate) {

        this.vehicleId = vehicleId;
        this.mechanicId = mechanicId;
        this.workInstructions = workInstructions;
        this.servicing = servicing;
        this.confirmed = confirmed;
        this.completed = completed;
        this.promisedDate = promisedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getMechanicId() {
        return mechanicId;
    }

    public void setMechanicId(int mechanicId) {
        this.mechanicId = mechanicId;
    }

    public String getWorkInstructions() {
        return workInstructions;
    }

    public void setWorkInstructions(String workInstructions) {
        this.workInstructions = workInstructions;
    }

    public boolean isServicing() {
        return servicing;
    }

    public void setServicing(boolean servicing) {
        this.servicing = servicing;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Date getPromisedDate() {
        return promisedDate;
    }

    public void setPromisedDate(Date promisedDate) {
        this.promisedDate = promisedDate;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

  
      public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    

}
