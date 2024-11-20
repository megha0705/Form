package com.practice.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    service s;
    
    @PostMapping("form")
   /*   public String formSubmission(@RequestBody CandidateEntity c){
        if(s.submission(c) == null){
            return "s is null";
        }else{
            return s.submission(c);

        }
    }*/
    public String formSubmissions(@ModelAttribute FormDTO formDTO){
       return  s.submission(formDTO);
    }
}
