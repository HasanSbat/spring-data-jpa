package repository;

import model.Admin;
import model.Message;
import model.Parent;
import model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MessageRepository extends JpaRepository<Message , Integer> {
    public Optional<Message> findAllByParentId(Integer id);

    public Optional<Message> findAllByAdminId(Integer id);

    public Optional<Message> findAllByTeacherId(Integer id);
}
