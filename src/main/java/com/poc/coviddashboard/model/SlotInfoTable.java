package com.poc.coviddashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "slot_info_table")
public class SlotInfoTable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "slot_id")
    private int slotId;

    @Column(name = "no_of_vaccines")
    private int no_of_vaccines;

    @Column(name = "start_time")
    private LocalDateTime slot_time;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "center_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private CenterInfoTable center;

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public int getNo_of_vaccines() {
        return no_of_vaccines;
    }

    public void setNo_of_vaccines(int no_of_vaccines) {
        this.no_of_vaccines = no_of_vaccines;
    }

    public LocalDateTime getSlot_time() {
        return slot_time;
    }

    public void setSlot_time(LocalDateTime slot_time) {
        this.slot_time = slot_time;
    }

    public SlotInfoTable(){}

    public SlotInfoTable(int slot_id, int no_of_vaccines, int center_id, LocalDateTime slot_time, CenterInfoTable center) {
        this.slotId = slot_id;
        this.no_of_vaccines = no_of_vaccines;
        this.slot_time = slot_time;
        this.center = center;
    }
}
