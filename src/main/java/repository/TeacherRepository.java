package repository;

import model.Admin;
import model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    Admin findUserByAdminNameAndPassWord(String fullName, String password);

}

