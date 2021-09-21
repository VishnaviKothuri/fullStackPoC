package com.poc.coviddashboard.model;

import java.time.LocalDateTime;

public class VaccineDto {
    private int centerId;

    private LocalDateTime slotTime;

    private int noOfVaccines;

    public VaccineDto centerId(int centerId){
        this.centerId=centerId;
        return this;
    }
    public int getCenterId() {
        return centerId;
    }

    public void setCenterId(int centerId) {
        this.centerId = centerId;
    }

    public VaccineDto slotTime(LocalDateTime slotTime){
        this.slotTime=slotTime;
        return this;
    }
    public LocalDateTime getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(LocalDateTime slotTime) {
        this.slotTime = slotTime;
    }

    public VaccineDto noOfVaccines(int noOfVaccines){
        this.noOfVaccines=noOfVaccines;
        return this;
    }
    public int getNoOfVaccines() {
        return noOfVaccines;
    }

    public void setNoOfVaccines(int noOfVaccines) {
        this.noOfVaccines = noOfVaccines;
    }

    @Override
    public String toString() {
        return "VaccineDto{" +
                "centerId=" + centerId +
                ", slotTime=" + slotTime +
                ", noOfVaccines=" + noOfVaccines +
                '}';
    }
}
