package com.poc.coviddashboard.service;

import com.poc.coviddashboard.model.CenterInfoTable;
import com.poc.coviddashboard.model.SlotInfoTable;
import com.poc.coviddashboard.repository.CenterRepository;
import com.poc.coviddashboard.util.ValidationsForApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CenterService {

    @Autowired
    private CenterRepository centerRepository;

    @Autowired
    private SlotService slotService;

    @Autowired
    private ValidationsForApi validations;

    public List<CenterInfoTable> fetchAll(){
        return centerRepository.findAll();
    }

    public void saveInfo(CenterInfoTable centerInfo){
        centerRepository.save(centerInfo);
    }

    public CenterInfoTable fetchByCenterId(Integer id){
        return centerRepository.findById(id).get();
    }

    public List<CenterInfoTable> fetchByCenterPincode(Integer pincode){
        List<CenterInfoTable> centerInfoTablesByPincode=centerRepository.findAllByPinCode(pincode);
        List<SlotInfoTable> slotsListForPincode=new ArrayList<>();
        centerInfoTablesByPincode.stream().forEach(pinCode->{
           // slotsListForPincode=slotRepository.findAllByCenterId(pinCode.getC_id());
        });
        return centerRepository.findAllByPinCode(pincode);
    }

    public void deleteInfo(Integer id){
        centerRepository.deleteById(id);
    }

    public void createCenterInformation(CenterInfoTable centerInformation) {
        if(centerInformation!=null){
            if(validations.isCenterIdExists(centerInformation.getId()))
                System.out.println("Center already Exists  ");
            else{
                centerRepository.save(centerInformation);
                System.out.println("New Center Information is added");
            }
        }
    }

    public void updateCenterInformation(Integer centerId,CenterInfoTable centerInformation){
        if(centerInformation!=null && validations.isCenterIdExists(centerId)){
            CenterInfoTable updateCenterInfo=centerRepository.findById(centerId).get();
            updateCenterInfo.setC_name(centerInformation.getC_name());
            updateCenterInfo.setC_city(centerInformation.getC_city());
            updateCenterInfo.setPinCode(centerInformation.getPinCode());
            updateCenterInfo.setState(centerInformation.getState());
            updateCenterInfo.setVaccine_type(centerInformation.getVaccine_type());
            centerRepository.save(updateCenterInfo);
        }
    }
}
