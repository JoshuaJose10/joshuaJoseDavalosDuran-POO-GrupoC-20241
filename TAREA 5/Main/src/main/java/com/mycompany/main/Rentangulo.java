package com.mycompany.main;

public class Rentangulo {
    
    private double largo;
    private double ancho;

    public Rentangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public double calcularArea(int largo, int ancho){
        return calcularArea((double) largo, (double) ancho);
    }
  
    public double calcularArea(double largo, double ancho){
        return largo * ancho;
    }
    
    public double calcularPerimetro(int largo, int ancho){
        return calcularPerimetro((double)largo, (double)ancho);
    }
   
    public double calcularPerimetro(double largo, double ancho){
        return 2*(largo+ancho);
    }
    
}
