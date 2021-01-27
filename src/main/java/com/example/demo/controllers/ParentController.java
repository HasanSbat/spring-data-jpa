package com.example.demo.controllers;

import com.example.demo.model.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.services.ParentService;

import javax.servlet.http.HttpSession;

@Controller
public class ParentController {
    @Autowired
    private ParentService parentService;

    @GetMapping("login")
    public String login(Model model){
        return "login";
    }
    @PostMapping("login")
    public String login2(@ModelAttribute("user") Parent userReceived, HttpSession session){
        Parent parent = parentService.getParentByPasswordAndFullName(userReceived.getFullName(), userReceived.getPassword());
        if(parent!= null) {
            System.out.println("user has logged in");
            session.setAttribute("currentUser", parent.getFullName());
            return "redirect:children";
        }
        else System.out.println("not logged in");
        return "login";
    }
}
