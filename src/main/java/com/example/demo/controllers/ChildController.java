package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.services.ChildService;

@Controller
public class ChildController {
    @Autowired
    private ChildService childService;

        @GetMapping("/Children")
    public String getChildren(Model model){
        model.addAttribute("children" , childService.getAllChildren());
    return "child";
    }
}
