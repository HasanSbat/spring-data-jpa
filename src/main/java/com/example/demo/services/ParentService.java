package com.example.demo.services;

import com.example.demo.model.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ParentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ParentService {
    @Autowired
   private ParentRepository parentRepository;

    public void addParent(Parent parent){
     parentRepository.save(parent);
    }
    public void editMessage(Parent parent, Integer id){
        Parent newParent= parentRepository.findById(id).get();
        newParent.setId(id);
        parentRepository.save(newParent);
    }
    public List<Parent> getAllParent() {
        List<Parent> parentList = new ArrayList<>();
        parentRepository.findAll().forEach(parent -> parentList.add(parent));
        return parentList;
    }
    public Optional<Parent> getParentById(Integer id){
        return parentRepository.findById(id);
    }

    public Parent getParentByPasswordAndFullName(String fullName, String password){
        return parentRepository.findParentByFullNameAndPassword(fullName,password);
    }
}
