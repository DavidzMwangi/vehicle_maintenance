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
public class CheckList implements Serializable {
    boolean jack;
        boolean jackHandle;
        boolean spareWheel;
        boolean radio;
        boolean wheelSpanner;
        boolean radioCassette;
        boolean radioSpeaker;
        boolean wheelCaps;
        boolean mirrors;
        boolean radioAntenna;
        int workOrderId;
        public CheckList(){
            
            
        }

    public int getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(int workOrderId) {
        this.workOrderId = workOrderId;
    }

    public boolean isRadioAntenna() {
        return radioAntenna;
    }

    public void setRadioAntenna(boolean radioAntenna) {
        this.radioAntenna = radioAntenna;
    }

    public boolean isJack() {
        return jack;
    }

    public void setJack(boolean jack) {
        this.jack = jack;
    }

    public boolean isJackHandle() {
        return jackHandle;
    }

    public void setJackHandle(boolean jackHandle) {
        this.jackHandle = jackHandle;
    }

    public boolean isSpareWheel() {
        return spareWheel;
    }

    public void setSpareWheel(boolean spareWheel) {
        this.spareWheel = spareWheel;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean isWheelSpanner() {
        return wheelSpanner;
    }

    public void setWheelSpanner(boolean wheelSpanner) {
        this.wheelSpanner = wheelSpanner;
    }

    public boolean isRadioCassette() {
        return radioCassette;
    }

    public void setRadioCassette(boolean radioCassette) {
        this.radioCassette = radioCassette;
    }

    public boolean isRadioSpeaker() {
        return radioSpeaker;
    }

    public void setRadioSpeaker(boolean radioSpeaker) {
        this.radioSpeaker = radioSpeaker;
    }

    public boolean isWheelCaps() {
        return wheelCaps;
    }

    public void setWheelCaps(boolean wheelCaps) {
        this.wheelCaps = wheelCaps;
    }

    public boolean isMirrors() {
        return mirrors;
    }

    public void setMirrors(boolean mirrors) {
        this.mirrors = mirrors;
    }
        
}
