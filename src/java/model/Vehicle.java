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
       String contactPerson;
       String fuelType;
       String odometerReading;
       String extension;

    public Vehicle(String regNo, String chasisNo, String modelNo, String department, String contactPerson, String fuelType, String odometerReading, String extension) {
        this.regNo = regNo;
        this.chasisNo = chasisNo;
        this.modelNo = modelNo;
        this.department = department;
        this.contactPerson = contactPerson;
        this.fuelType = fuelType;
        this.odometerReading = odometerReading;
        this.extension = extension;
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

    public String getContactPerson() {
        return contactPerson;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getOdometerReading() {
        return odometerReading;
    }

    public String getExtension() {
        return extension;
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

    public void setContact_person(String contact_person) {
        this.contactPerson = contact_person;
    }

    public void setFuel_type(String fuel_type) {
        this.fuelType = fuel_type;
    }

    public void setOdometerReading(String odometerReading) {
        this.odometerReading = odometerReading;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "regNo=" + regNo + ", chasisNo=" + chasisNo + ", modelNo=" + modelNo + ", department=" + department + ", contact_person=" + contactPerson + ", fuel_type=" + fuelType + ", odometerReading=" + odometerReading + ", extension=" + extension + '}';
    }
       
       
}
