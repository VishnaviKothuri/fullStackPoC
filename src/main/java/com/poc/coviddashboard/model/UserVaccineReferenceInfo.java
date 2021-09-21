package com.poc.coviddashboard.model;

import javax.persistence.*;

@Entity
@Table(name="user_vaccine_reference_info")
public class UserVaccineReferenceInfo {

    @Id
    @Column(name = "user_id")
    long user_id;

    @Column(name = "slot_id")
    long slot_id;

    @Column(name="booked_vaccines")
    long booked_vaccines;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(long slot_id) {
        this.slot_id = slot_id;
    }

    public long getBooked_vaccines() {
        return booked_vaccines;
    }

    public void setBooked_vaccines(long booked_vaccines) {
        this.booked_vaccines = booked_vaccines;
    }
}
