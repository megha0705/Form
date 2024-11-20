package com.practice.demo;

import javax.swing.text.html.parser.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceImp implements service{
   
    @Autowired
    CandidateRepo canRepo;
    @Override
    public String submission(FormDTO formDTO) {
        CandidateEntity entity = new CandidateEntity();
        entity.setName(formDTO.getName());
        entity.setAge(formDTO.getAge());
        entity.setSkills(formDTO.getSkills());
        entity.setQualification(formDTO.getQualifications());
        entity.setContact_details(formDTO.getContact());
        canRepo.save(entity);
        return "saved succesfully";
    }
    
}
