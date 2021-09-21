package com.poc.coviddashboard.util;

import com.poc.coviddashboard.model.CenterInfoTable;
import com.poc.coviddashboard.repository.CenterRepository;
import com.poc.coviddashboard.repository.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ValidationsForApi {

    @Autowired
    private CenterRepository centerRepository;

    @Autowired
    private SlotRepository slotRepository;

    public boolean isCenterIdExists(Integer centerId){
        return centerRepository.existsById(centerId)?true:false;
    }

    public boolean isSlotExists(Integer slotId){
       return slotRepository.existsById(slotId)?true:false;
    }
}
