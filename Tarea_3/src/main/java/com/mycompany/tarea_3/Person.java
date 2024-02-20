package com.mycompany.tarea_3;

public class Person {
    
    String name;
    int age;
    char gender;
    
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
      
    }
    
    public String getPersonInformation (){
        return String.format("Name: %s \nAge: %s \nGender: %s ",name,age,gender);
    }
}

