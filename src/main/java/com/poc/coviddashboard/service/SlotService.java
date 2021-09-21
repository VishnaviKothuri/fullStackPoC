package com.poc.coviddashboard.service;

import com.poc.coviddashboard.model.SlotInfoTable;
import com.poc.coviddashboard.repository.CenterRepository;
import com.poc.coviddashboard.repository.SlotRepository;
import com.poc.coviddashboard.util.ValidationsForApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SlotService {
    @Autowired
    private SlotRepository slotRepository;

    @Autowired
    private CenterRepository centerRepository;

    @Autowired
    private ValidationsForApi validations;

    public List<SlotInfoTable> fetchAllAvailableSlots(){
        return slotRepository.findAll();
    }

    public SlotInfoTable fetchSlotById(Integer slotId){
        return slotRepository.findById(slotId).get();
    }

    public SlotInfoTable fetchSlotByCenterId(Integer centerId){
        return slotRepository.findBySlotIdAndCenterId(1,centerId);
    }

    public Page<SlotInfoTable> getAllSlotsByCenterId(Integer centerId, Pageable pageable){
        return slotRepository.findByCenterId(centerId,pageable);
    }
    public void createSlots(SlotInfoTable slotInformation){
        if(slotInformation!=null && validations.isSlotExists(slotInformation.getSlotId())==false){
            slotRepository.save(slotInformation);
            System.out.println("Slot created with slot_id : "+slotInformation.getSlotId());
        }
        else
            System.out.println("Slot already exists ..!");
    }

    public void deleteSlot(Integer slotId){
        if(validations.isSlotExists(slotId))
        {
            slotRepository.deleteById(slotId);
        }
        else{
            System.out.println("No slot with slotId : "+slotId+" is available to delete");
        }
    }
}
