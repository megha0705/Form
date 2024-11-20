package com.practice.demo;

public class FormDTO {
   private String name;
   private int age;
   private String qualifications;
   private String skills;
   private String contact;

   public String getName(){
    return name;
   }
   public String getSkills(){
    return skills;
   }
   public int getAge(){
    return age;
   }
   public String getQualifications(){
    return qualifications;
   }
   public String getContact(){
    return contact;
   }

   public void setContact(String contact){
    this.contact = contact;
   }
   public void setName(String name){
    this.name = name;
   }
   public void setSkills(String skills){
    this.skills = skills;
   }
   public void setAge(int age){
    this.age = age;
   }
   public void setQualifications(String qualifications){
    this.qualifications = qualifications;
   }
}
