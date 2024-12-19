package com.practice.demo;

import java.io.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class Controller {
    @Autowired
    service s;
    
    @PostMapping("form")
    public String formSubmissions(@ModelAttribute FormDTO formDTO, @RequestParam MultipartFile file){
    
        PdfProccesing pdf = new PdfProccesing();
        pdf.processPdf(file);
       return  s.submission(formDTO);
    }

   
    
}
