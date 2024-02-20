package com.mycompany.tarea_3;

public class Tarea_3 {

    public static void main(String[] args) {
        
            Person firstPerson = new Person("Julia", 15, 'F');
            Person secondPerson = new Person("Raul", 25, 'M');
            Person thirdPerson = new Person("Daniela", 31, 'F');
            Person fourthPerson = new Person("Sergio", 18, 'M');
            
            System.out.println(firstPerson.getPersonInformation());
            System.out.println("********");
            System.out.println(secondPerson.getPersonInformation());
            System.out.println("********");
            System.out.println(thirdPerson.getPersonInformation());
            System.out.println("********");
            System.out.println(fourthPerson.getPersonInformation());
            
            System.out.println("");
            System.out.println("");
            
            Book firstBook = new Book();
            firstBook.title = "El principito";
            firstBook.author = "Antoine de Saint-Exupéry";
            firstBook.yearPublication = 1943;
            firstBook.getBookInformation();
            System.out.println("********");
            Book secondBook = new Book();
            Book thirdBook = new Book();
            Book fourthBook = new Book();
            
            secondBook.title = "1984";
            secondBook.author = "George Orwell";
            secondBook.yearPublication = 1949;
            secondBook.getBookInformation();
            System.out.println("********");
            thirdBook.title = "Cien años de soledad";
            thirdBook.author = "Gabriel García Márquez";
            thirdBook.yearPublication = 1967;
            thirdBook.getBookInformation();
            System.out.println("********");
            fourthBook.title = "Don Quijote de la Mancha";
            fourthBook.author = "Miguel de Cervantes";
            fourthBook.yearPublication = 1605;
            fourthBook.getBookInformation();
            
            System.out.println("");
            System.out.println("");
            
            Rentangle fistRentangle = new Rentangle(4, 5);
            Rentangle secondRentangle = new Rentangle(6, 7);
            Rentangle thirdRentangle = new Rentangle(8, 9);
            Rentangle fourthRentangle = new Rentangle(10, 11);
            
            System.out.println("First Rentangle Area: " + fistRentangle.calculateArea());
            System.out.println("First Rentangle Perimeter: " + fistRentangle.calculatePerimeter());
            System.out.println("********");
            System.out.println("Second Rentangle Area: " + secondRentangle.calculateArea());
            System.out.println("Second Rentangle Perimeter: " + secondRentangle.calculatePerimeter());
            System.out.println("********");
            System.out.println("Third Rentangle Area: " + thirdRentangle.calculateArea());
            System.out.println("Third Rentangle Perimeter: " + thirdRentangle.calculatePerimeter());
            System.out.println("********");
            System.out.println("Fourth Rentangle Area: " + fourthRentangle.calculateArea());
            System.out.println("Fourth Rentangle Perimeter: " + fourthRentangle.calculatePerimeter());
    }
}
