package com.poc.coviddashboard.controller;

import com.poc.coviddashboard.model.SlotInfoTable;
import com.poc.coviddashboard.service.SlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class SlotController {
    @Autowired
    private SlotService slotService;

    @GetMapping("/getAllSlots")
    public ResponseEntity<HttpStatus> getAllSlots(){
        slotService.fetchAllAvailableSlots();
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/getSlotsByCenterId/{centerId}")
    public ResponseEntity<HttpStatus> getSlotsForCenter(@PathVariable("centerId") Integer centerId, Pageable pageable){
        //slotService.fetchSlotByCenterId(centerId);
        slotService.getAllSlotsByCenterId(centerId,pageable);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/addSlot")
    public ResponseEntity<HttpStatus> createNewSlot(@Valid @RequestBody SlotInfoTable slotInformation){
        slotService.createSlots(slotInformation);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/removeSlot/{slotId}")
    public ResponseEntity<HttpStatus> deleteSlot(@PathVariable Integer slotId){
        slotService.deleteSlot(slotId);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
