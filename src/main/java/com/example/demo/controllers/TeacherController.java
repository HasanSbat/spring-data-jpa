package com.example.demo.controllers;

import  com.example.demo.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.services.TeacherService;
import javax.servlet.http.HttpSession;

@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("login")
    public String login(Model model) {
        model.addAttribute("user", new Teacher("", ""));
        return "login";
    }

    @PostMapping("login")
    public String login2(@ModelAttribute("user") Teacher userReceived, HttpSession session){
        Teacher teacher = teacherService.getTeacherByPasswordAndFullName(userReceived.getFullName(), userReceived.getPassword());
        if(teacher!= null) {
            System.out.println("user has logged in");
            session.setAttribute("currentUser", teacher.getFullName());
            return "redirect:children";
        }
        else System.out.println("not logged in");
        return "login";
    }
}
