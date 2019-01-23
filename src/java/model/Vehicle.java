/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author mwang
 */
public class Vehicle implements Serializable {
        int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
      String regNo;
       String chasisNo;
       String modelNo;
       String department;
       String fuelType; //double and fuel
       String odometerReading; //int
       //add engine no
       int engineNo;

    public int getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(int engineNo) {
        this.engineNo = engineNo;
    }
    public Vehicle(String regNo, int engineNo,String chasisNo, String modelNo, String department, String fuelType, String odometerReading) {
        this.regNo = regNo;
        this.chasisNo = chasisNo;
        this.modelNo = modelNo;
        this.department = department;
        this.fuelType = fuelType;
        this.odometerReading = odometerReading;
        this.engineNo=engineNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getChasisNo() {
        return chasisNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public String getDepartment() {
        return department;
    }

    

    public String getFuelType() {
        return fuelType;
    }

    public String getOdometerReading() {
        return odometerReading;
    }

  

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void setChasisNo(String chasisNo) {
        this.chasisNo = chasisNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

  
    public void setFuel_type(String fuel_type) {
        this.fuelType = fuel_type;
    }

    public void setOdometerReading(String odometerReading) {
        this.odometerReading = odometerReading;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", regNo=" + regNo + ", chasisNo=" + chasisNo + ", modelNo=" + modelNo + ", department=" + department + ", fuelType=" + fuelType + ", odometerReading=" + odometerReading + ", engineNo=" + engineNo + '}';
    }

   

       
       
}
