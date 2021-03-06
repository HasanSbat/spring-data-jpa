package com.example.demo.repository;

import com.example.demo.model.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent,Integer> {

    Parent findParentByFullNameAndPassword(String fullName, String password);
}
