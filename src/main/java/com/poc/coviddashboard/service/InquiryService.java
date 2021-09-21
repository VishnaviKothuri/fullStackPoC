package com.poc.coviddashboard.service;

import com.poc.coviddashboard.model.CenterInfoTable;
import com.poc.coviddashboard.model.RetrieveVaccineDetailsResponse;
import com.poc.coviddashboard.model.SlotInfoTable;
import com.poc.coviddashboard.model.VaccineDto;
import com.poc.coviddashboard.repository.CenterRepository;
import com.poc.coviddashboard.repository.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class InquiryService {
    @Autowired
    CenterRepository centerRepository;

    @Autowired
    SlotRepository slotRepository;

    VaccineDto vaccineDto=new VaccineDto();


    public RetrieveVaccineDetailsResponse retrieveAllSlotsAndVaccines(int pincode){
        List<CenterInfoTable> centerInfo= (List<CenterInfoTable>) centerRepository.findAll();
        //Optional<CenterInfoTable> inf1=centerRepository.findById(pincode);
        CenterInfoTable ind1=centerRepository.findByPinCode(pincode);
        Optional<CenterInfoTable> cntrinfo=centerRepository.getByPinCode(pincode);
        System.out.println("*************");
       // System.out.println(inf1);
        System.out.println(ind1);
        System.out.println(cntrinfo);


        vaccineDto=processVaccineByPincodeDto(pincode,vaccineDto, Arrays.asList(ind1));
        RetrieveVaccineDetailsResponse response=new RetrieveVaccineDetailsResponse();
        response.setVaccineDto(vaccineDto);
        return response;
    }

    private VaccineDto processVaccineByPincodeDto(int pincode, VaccineDto vaccineDto, List<CenterInfoTable> centerInfo) {

        CenterInfoTable centerInfoEntity = null;
        SlotInfoTable slotInfoEntity = null;
        System.out.println(centerInfo);
        centerInfoEntity=centerInfo.get(0);
        vaccineDto.setCenterId(centerInfoEntity.getId());
       // vaccineDto.setSlotTime(slotInfoEntity.getSlot_time());
        //vaccineDto.setNoOfVaccines(slotInfoEntity.getNo_of_vaccines());
        return vaccineDto;
    }
}
