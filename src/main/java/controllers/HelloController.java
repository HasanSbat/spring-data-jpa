package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping("hi")
    public ModelAndView helloMethod2(){
        String text = "Best planet";
        return new ModelAndView("test", "message", text);
    }

    @GetMapping("hoi")
    public  String helloMethod(){
        String text = "Best planet";
        return "test";
    }



    @GetMapping("hoihoi")
    public  String helloMethod3(Model model){

        String text = "Worst planet";
        model.addAttribute("message", text);
        model.addAttribute("second", text+"!");
        return "test";
    }
}
