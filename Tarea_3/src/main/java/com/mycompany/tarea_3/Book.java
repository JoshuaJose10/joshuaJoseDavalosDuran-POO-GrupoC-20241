package com.mycompany.tarea_3;

public class Book {
    
    String title = "El principito";
    String author = "Antoine de Saint-Exupéry";
    int yearPublication = 1943;
    
    public void getBookInformation (){
        
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Publication: " + yearPublication);
    }
}
