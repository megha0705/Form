package com.practice.demo;
import java.io.*;
import java.io.FileInputStream;
import org.hibernate.boot.Metadata;
import org.springframework.web.multipart.MultipartFile;
import org.apache.*;
public class PdfProccesing {
    
    public static void processPdf(MultipartFile file) {
        //TODO Auto-generated constructor stub
        String directory = "C:/Users/Reshmi Chakraborty/Desktop/coding/projects/form/pdfFiles";
        File files =  new File(directory);
        if(!files.exists()){
            files.mkdir();
        }
        File f = new File(directory, file.getOriginalFilename());
        try{
             file.transferTo(f);
        }catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
      //  System.out.println("new file path is " + directory + "/"+file.getOriginalFilename());
    }
   
    }

   

