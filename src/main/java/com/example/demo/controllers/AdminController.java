package com.example.demo.controllers;

import com.example.demo.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.services.AdminService;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("login")
    public String login(Model model){
        model.addAttribute("user", new Admin("",""));
        return "login";
    }
    @PostMapping("login")
    public String login2(@ModelAttribute("user") Admin userReceived, HttpSession session){
        Admin admin = adminService.getAdminByPasswordAndFullName(userReceived.getFullName(), userReceived.getPassword());
        if(admin!= null) {
            System.out.println("user has logged in");
            session.setAttribute("currentUser", admin.getFullName());
            return "redirect:children";
        }
        else System.out.println("not logged in");
        return "login";
    }


}
