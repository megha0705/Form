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

        String newFileDirectory =  directory + "/"+file.getOriginalFilename();
        pdfDataExtract(newFileDirectory);
      //  System.out.println("new file path is " + directory + "/"+file.getOriginalFilename());
    }
    public static void pdfDataExtract(String newFileDirectory){
         // Create a content handler
        BodyContentHandler contenthandler = new BodyContentHandler();
 
        // Create a file in local directory
        File f = new File(newFileDirectory);
 
        // Create a file input stream
        // on specified path with the created file
        FileInputStream fstream = new FileInputStream(f);
 
        // Create an object of type Metadata to use
        Metadata data = new Metadata();
 
        // Create a context parser for the pdf document
        ParseContext context = new ParseContext();
 
        // PDF document can be parsed using the PDFparser
        // class
        PDFParser pdfparser = new PDFParser();
 
        // Method parse invoked on PDFParser class
        pdfparser.parse(fstream, contenthandler, data,
                        context);
    }

   
}
