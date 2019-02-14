/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Spare implements Serializable{
    int id;
    String name;
    boolean isApproved;
    int workOrderId;
    public Spare(){
        
    }

    public Spare(int id, String name, boolean approved, int workOrderId) {

            this.id=id;
            this.name=name;
            this.isApproved=approved;
            this.workOrderId=workOrderId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public int getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(int workOrderId) {
        this.workOrderId = workOrderId;
    }
    
}
