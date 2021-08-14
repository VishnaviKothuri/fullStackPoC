package com.poc.coviddashboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table
public class UserInfoTable {

    @Id
    @Column
    private int user_id;

    @Column
    private int adh_no;

    @Column
    private String u_name;

    @Column
    private long ph_no;

    @Column
    private Date dob;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAdh_no() {
        return adh_no;
    }

    public void setAdh_no(int adh_no) {
        this.adh_no = adh_no;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public long getPh_no() {
        return ph_no;
    }

    public void setPh_no(long ph_no) {
        this.ph_no = ph_no;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
