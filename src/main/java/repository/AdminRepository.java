package repository;

import model.Admin;
import model.Child;
import model.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin, Integer> {


    Admin findUserByAdminNameAndPassWord(String fullName, String password);
}
