package com.poc.coviddashboard.controller;

import com.poc.coviddashboard.model.CenterInfoTable;
import com.poc.coviddashboard.service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CenterController {

    @Autowired
    private CenterService centerService;
    
    @GetMapping("/centerInfoByPincode/{pinCode}")
    public List<CenterInfoTable> getCenterInfoByPincode(@PathVariable("pinCode") Integer pincode){
        return centerService.fetchByCenterPincode(pincode);
    }

    @GetMapping("/centerInformation")
    public List<CenterInfoTable> getCenterInfo(){
        return centerService.fetchAll();
    }

    @PostMapping("/createCenterInfo")
    public ResponseEntity<HttpStatus> createCenters(@RequestBody CenterInfoTable centerInformation){
        centerService.createCenterInformation(centerInformation);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/updateCenterInfo/{centerId}")
    public ResponseEntity<CenterInfoTable> updateCenter(@PathVariable("centerId") Integer centerID,@RequestBody CenterInfoTable centerInformation){
        centerService.updateCenterInformation(centerID,centerInformation);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

