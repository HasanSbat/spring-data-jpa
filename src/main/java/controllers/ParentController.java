package controllers;

import model.Parent;
import model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import services.ParentService;

@Controller
public class ParentController {

    @Autowired
    private ParentService parentService;

    @GetMapping("login")
    public String login(Model model){
        model.addAttribute("user", new Parent("",""));
        return "login";
    }
}
