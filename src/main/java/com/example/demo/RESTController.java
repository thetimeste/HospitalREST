package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import jakarta.servlet.http.HttpServletResponse;

import javax.swing.text.View;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

 


@Controller
public class RESTController {

    @GetMapping("/")
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main.html");
        return modelAndView;
    }

    @GetMapping("/data")
    public ModelAndView getdata() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("data.html");
        return modelAndView;
    }

    @PostMapping("/data")
    public String postdata(@RequestBody User userData) {

        System.out.println("Received data: " + userData);
        return "redirect:/questions.html"; 
    }
 
    @GetMapping("/questions")
    public ModelAndView getquestions() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("questions.html");
        return modelAndView;
    }

    @PostMapping("/questions")
    public String postQuestions(Questions questionsData, HttpServletResponse response) {
        System.out.println("Received data: " + questionsData);
        return "redirect:/result"; 
    }


 

    
    
}
