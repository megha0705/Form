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
        //this is the diirectory where the pdf will be saved
        String directory = "C:/Users/Reshmi Chakraborty/Desktop/coding/projects/form/pdfFiles";
        File f = new File(directory);
        //if the directory doesn't exist we are cr4eating it
        if(!f.exists()){
            f.mkdirs();
        }
        //then inn the directory we are getting teh actual file name
        File files = new File(directory , file.getOriginalFilename());
        try {
            //saving the file in the directory
            file.transferTo(files);
            System.out.println("pdf saved");
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       return  s.submission(formDTO);
    }

   
    
}
Form\form\src\main\java\com\practice\demo\Controller.java