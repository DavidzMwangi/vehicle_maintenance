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
public class ServicingCard implements Serializable{
    boolean engineOilChange;
    boolean gearboxOilLevel;
    boolean diffOilLevel;
    boolean radioatorWaterLevel;
    boolean powerSteering;
    boolean brakeFluid;
    boolean clutchFluid;
    boolean fanBeltTension;
    boolean batteryElectrolyteWater;
    boolean allLightsChecked;
    boolean batteryTerminalTightGrease;
    boolean windscreenWiperWater;

    
    public ServicingCard(){
        
        
        
    }
    public boolean isEngineOilChange() {
        return engineOilChange;
    }

    public void setEngineOilChange(boolean engineOilChange) {
        this.engineOilChange = engineOilChange;
    }

    public boolean isGearboxOilLevel() {
        return gearboxOilLevel;
    }

    public void setGearboxOilLevel(boolean gearboxOilLevel) {
        this.gearboxOilLevel = gearboxOilLevel;
    }

    public boolean isDiffOilLevel() {
        return diffOilLevel;
    }

    public void setDiffOilLevel(boolean diffOilLevel) {
        this.diffOilLevel = diffOilLevel;
    }

    public boolean isRadioatorWaterLevel() {
        return radioatorWaterLevel;
    }

    public void setRadioatorWaterLevel(boolean radioatorWaterLevel) {
        this.radioatorWaterLevel = radioatorWaterLevel;
    }

    public boolean isPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    public boolean isBrakeFluid() {
        return brakeFluid;
    }

    public void setBrakeFluid(boolean brakeFluid) {
        this.brakeFluid = brakeFluid;
    }

    public boolean isClutchFluid() {
        return clutchFluid;
    }

    public void setClutchFluid(boolean clutchFluid) {
        this.clutchFluid = clutchFluid;
    }

    public boolean isFanBeltTension() {
        return fanBeltTension;
    }

    public void setFanBeltTension(boolean fanBeltTension) {
        this.fanBeltTension = fanBeltTension;
    }

    public boolean isBatteryElectrolyteWater() {
        return batteryElectrolyteWater;
    }

    public void setBatteryElectrolyteWater(boolean batteryElectrolyteWater) {
        this.batteryElectrolyteWater = batteryElectrolyteWater;
    }

    public boolean isAllLightsChecked() {
        return allLightsChecked;
    }

    public void setAllLightsChecked(boolean allLightsChecked) {
        this.allLightsChecked = allLightsChecked;
    }

    public boolean isBatteryTerminalTightGrease() {
        return batteryTerminalTightGrease;
    }

    public void setBatteryTerminalTightGrease(boolean batteryTerminalTightGrease) {
        this.batteryTerminalTightGrease = batteryTerminalTightGrease;
    }

    public boolean isWindscreenWiperWater() {
        return windscreenWiperWater;
    }

    public void setWindscreenWiperWater(boolean windscreenWiperWater) {
        this.windscreenWiperWater = windscreenWiperWater;
    }
    
    
    
}
