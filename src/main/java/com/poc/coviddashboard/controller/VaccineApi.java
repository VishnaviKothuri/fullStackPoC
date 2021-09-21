package com.poc.coviddashboard.controller;

import com.poc.coviddashboard.model.RetrieveVaccineDetailsResponse;
import com.poc.coviddashboard.model.UserInfoTable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/pocApi")
public interface VaccineApi {
    @PostMapping(path="/users/register",produces = "application/json")
    ResponseEntity<UserInfoTable> registerUser(@Valid @RequestBody UserInfoTable user);

    @GetMapping(path = "/vaccine/fetchAll/{pincode}",produces = "application/json")
    ResponseEntity<RetrieveVaccineDetailsResponse> fetchAllSlotsAndVaccines(@PathVariable("pincode") int pincode);
}
