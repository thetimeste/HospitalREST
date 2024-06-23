package com.example.demo;

import org.springframework.web.servlet.ModelAndView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

 

@Controller
public class RESTController {

HealthCalculator healthCalculator = new HealthCalculator();

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
    public ResponseEntity<?> postdata(@RequestBody User userData) {
        healthCalculator.addUserToArrayList(userData);
        System.out.println("Received data: " + userData);
        return ResponseEntity.accepted().body("ok");
    }
 
    @GetMapping("/questions")
    public ModelAndView getquestions() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("questions.html");
        return modelAndView;
    }
 
    @PostMapping("/questions")
    public ResponseEntity<?> postQuestions(@RequestBody Questions questionsData) {
        healthCalculator.addQuestionsToArrayList(questionsData);
        System.out.println("Received data: " + questionsData);
        boolean status = healthCalculator.calculateHealthStatus(questionsData);
        if(status){
            return ResponseEntity.accepted().body(Collections.singletonMap("severity", "high"));
        }
        else{
            return ResponseEntity.accepted().body(Collections.singletonMap("severity", "low"));
        }
    }
 
    @GetMapping("/result_ok")
    public ModelAndView getresultok() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("result_ok.html");
        return modelAndView;
    } 
  
    @GetMapping("/result_danger")
    public ModelAndView getresultdanger() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("result_danger.html");
        return modelAndView;
    }
 
    @GetMapping("/setCookie")
    public ResponseEntity<Map<String, String>> setCookie() {
        int randomInt = (int) (Math.random() * Integer.MAX_VALUE);
        Map<String, String> response = new HashMap<>();
        String value = Integer.toString(randomInt);
        response.put("id", value); 
        return ResponseEntity.ok(response);
    }
  
}
