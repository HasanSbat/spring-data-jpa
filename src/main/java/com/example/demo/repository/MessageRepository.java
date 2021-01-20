package com.example.demo.repository;

import com.example.demo.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MessageRepository extends JpaRepository<Message , Integer> {
    public Optional<Message> findAllByParentId(Integer id);

    public Optional<Message> findAllByAdminId(Integer id);

    public Optional<Message> findAllByTeacherId(Integer id);
}
