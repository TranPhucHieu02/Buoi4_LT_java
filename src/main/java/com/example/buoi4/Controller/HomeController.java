package com.example.buoi4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.buoi4.Service.CourseService;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private CourseService courseService; 
    @GetMapping("/test")
    public String index (){
        return "home";
    }
    @GetMapping("")
    public String index(Model model){
        model.addAttribute("listcourse",courseService.GetAll());
        return "home";
    } 
}
