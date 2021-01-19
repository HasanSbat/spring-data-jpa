package controllers;

import model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import services.AdminService;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("login")
    public String login(Model model){
        model.addAttribute("user", new Admin("",""));
        return "login";
    }

}
