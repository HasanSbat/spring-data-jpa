package controllers;

import  model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import services.TeacherService;

@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("login")
    public String login(Model model){
        model.addAttribute("user", new Teacher("",""));
        return "login";
    }

}
