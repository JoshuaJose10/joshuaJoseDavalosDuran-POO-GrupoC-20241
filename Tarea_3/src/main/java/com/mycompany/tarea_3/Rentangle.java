package com.mycompany.tarea_3;

public class Rentangle {
    
    double height;
    double wide;
    
     public Rentangle(double height, double wide) {
        this.wide = wide;
        this.height = height;
    }
     
     public double calculateArea() {
        return wide * height;
    }
     
     public double calculatePerimeter() {
        return 2 * (wide + height);
    }
}

