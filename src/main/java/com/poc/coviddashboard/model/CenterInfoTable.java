package com.poc.coviddashboard.model;

import javax.persistence.*;

@Entity
public class CenterInfoTable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="center_id")
    int id;

    @Column(name="pincode")
    private int pinCode;

    @Column(name="city")
    private String c_city;

    @Column(name="center_name")
    private String c_name;

    @Column(name="state")
    private String state;

    @Column(name="vaccine_type")
    private String vaccine_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVaccine_type() {
        return vaccine_type;
    }

    public void setVaccine_type(String vaccine_type) {
        this.vaccine_type = vaccine_type;
    }

    @Override
    public String toString() {
        return "CenterInfoTable{" +
                "c_id=" + id +
                ", pinCode=" + pinCode +
                ", c_city='" + c_city + '\'' +
                ", c_name='" + c_name + '\'' +
                ", state='" + state + '\'' +
                ", vaccine_type='" + vaccine_type + '\'' +
                '}';
    }

    public CenterInfoTable(){
    }
    public CenterInfoTable(int pinCode, String c_city, String c_name, String state, String vaccine_type) {
        this.pinCode = pinCode;
        this.c_city = c_city;
        this.c_name = c_name;
        this.state = state;
        this.vaccine_type = vaccine_type;
    }
}
