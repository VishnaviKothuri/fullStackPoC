package com.poc.coviddashboard.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user_info_table")
public class UserInfoTable {
    
    @Id
    @GeneratedValue
    @Column(name = "user_id")
     long user_id;

    @Column(name = "username")
    private String name;

    @Column(name = "phone_no")
    private int phoneNo;

    @Column(name = "aadhar_no")
    private long aadharNo;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "password")
    private String password;

    @Column(name= "logged_in")
    private int loggedIn;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public long getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(long aadharNo) {
        this.aadharNo = aadharNo;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(int loggedIn) {
        this.loggedIn = loggedIn;
    }
}
