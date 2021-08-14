package com.poc.coviddashboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table
public class SlotInfoTable {

    @Id
    @Column
    private int slot_id;

    @Column
    private int c_id;

    @Column
    private int user_id;

    @Column
    private LocalDateTime slot_time;

    public int getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public LocalDateTime getSlot_time() {
        return slot_time;
    }

    public void setSlot_time(LocalDateTime slot_time) {
        this.slot_time = slot_time;
    }
}
