package com.poc.coviddashboard.service;

import com.poc.coviddashboard.model.UserInfoTable;
import com.poc.coviddashboard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserInfoTable> getAllUsers(){
        return (List<UserInfoTable>) userRepository.findAll();
    }

    public void saveNewUser(UserInfoTable user) {
        userRepository.save(user);
    }
}
