package services;

import model.Admin;
import model.Message;
import model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TeacherRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public void addTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }
    public void editMessage(Teacher teacher, Integer id){
        Teacher newTeacher= teacherRepository.findById(id).get();
        newTeacher.setId(id);
        teacherRepository.save(newTeacher);
    }
    public List<Teacher> getAllTeaches() {

        return teacherRepository.findAll();
    }
    public Optional<Teacher> getMessageById(Integer id){
        return teacherRepository.findById(id);
    }

    public Admin getAdminByPassWordAndUserName(String fullName, String password){
        return teacherRepository.findUserByAdminNameAndPassWord(fullName,password);
    }
}
