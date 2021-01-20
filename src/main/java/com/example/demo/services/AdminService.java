package com.example.demo.services;

import com.example.demo.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.AdminRepository;

@Service

public class AdminService {
    @Autowired
    private static AdminRepository adminRepository;

    public void createAdmin(Admin admin){
        adminRepository.save(admin);
    }
    public Admin getAdminByPasswordAndFullName(String fullName, String password){
        return adminRepository.findAdminByFullNameAndPassword(fullName,password);
    }
}
