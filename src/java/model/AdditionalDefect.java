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
public class AdditionalDefect implements Serializable {
    int id;
    int workOrderId; 
    String name;
    boolean approved;
    
    public AdditionalDefect(){
        
        
    }

    public AdditionalDefect(int id, String name, boolean approved, int workOrderId) {
            this.id=id;
            this.name=name;
            this.approved=approved;
            this.workOrderId=workOrderId;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(int workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
    
}
