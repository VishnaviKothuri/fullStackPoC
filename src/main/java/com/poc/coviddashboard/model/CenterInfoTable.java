package com.poc.coviddashboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CenterInfoTable {

    @Id
    @Column
    private int c_id;

    @Column
    private int pinCode;

    @Column
    private String c_city;

    @Column
    private String c_name;

    @Column
    private int no_of_slots;

    @Column
    private String vaccine_type;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getC_city() {
        return c_city;
    }

    public void setC_city(String c_city) {
        this.c_city = c_city;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getNo_of_slots() {
        return no_of_slots;
    }

    public void setNo_of_slots(int no_of_slots) {
        this.no_of_slots = no_of_slots;
    }

    public String getVaccine_type() {
        return vaccine_type;
    }

    public void setVaccine_type(String vaccine_type) {
        this.vaccine_type = vaccine_type;
    }
}
