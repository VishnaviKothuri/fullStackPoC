package com.poc.coviddashboard.controller;

import com.poc.coviddashboard.model.CenterInfoTable;
import com.poc.coviddashboard.model.RetrieveVaccineDetailsResponse;
import com.poc.coviddashboard.model.UserInfoTable;
import com.poc.coviddashboard.repository.CenterRepository;
import com.poc.coviddashboard.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class VaccineApiImp implements VaccineApi{
    @Autowired
    InquiryService inquiryService;

    @Autowired
    CenterRepository repo;
    @Override
    public ResponseEntity<UserInfoTable> registerUser(UserInfoTable user) {
        return null;
    }

    @Override
    public ResponseEntity<RetrieveVaccineDetailsResponse> fetchAllSlotsAndVaccines(int pincode) {
        System.out.println("VEFDCsc "+repo.findAll());
        RetrieveVaccineDetailsResponse response=inquiryService.retrieveAllSlotsAndVaccines(pincode);
        System.out.println("VEFDCsc "+repo.findAll());
        return ResponseEntity.ok(response);
    }

}
