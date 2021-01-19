package repository;

import model.Admin;
import model.Child;
import model.Parent;
import model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ChildRepository extends JpaRepository<Child, Integer> {

   public Optional<Child> findAllByAdminId(Integer id);

    public Optional<Child> findAllByTeacherId(Integer id);
}

