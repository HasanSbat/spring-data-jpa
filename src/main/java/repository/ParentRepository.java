package repository;

import model.Admin;
import model.Parent;
import model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ParentRepository extends JpaRepository<Parent,Integer> {

    Parent findUserByParentNameAndPassWord(String fullName, String password);
}
