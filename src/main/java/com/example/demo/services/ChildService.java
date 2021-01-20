package com.example.demo.services;

import com.example.demo.model.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ChildRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ChildService {
    @Autowired
    private ChildRepository childRepository;
    public void addChild(Child child){
        childRepository.save(child);
    }

    public void editChildData(Child child , Integer id){
        Child newChildData = childRepository.findById(id).get();
        newChildData.setId(id);
        childRepository.save(newChildData);
    }
    public List<Child> getAllChildren(){
        List<Child> childList = new ArrayList<>();
        childRepository.findAll().forEach(child -> childList.add(child));
    return childList;
    }
  public Optional<Child> getChildrenById(Integer id){
        return childRepository.findById(id);
  }

}
