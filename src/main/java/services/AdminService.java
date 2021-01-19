package services;

import model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AdminRepository;

@Service

public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public void createAdmin(Admin admin){
        adminRepository.save(admin);
    }

    public Admin getAdminByPassWordAndUserName(String fullName, String password){
        return adminRepository.findUserByAdminNameAndPassWord(fullName,password);
    }
}
