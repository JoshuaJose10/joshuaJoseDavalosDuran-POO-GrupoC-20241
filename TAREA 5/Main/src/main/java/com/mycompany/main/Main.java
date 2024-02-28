package com.mycompany.main;

public class Main {

    public static void main(String[] args) {
        
        Rentangulo rentangulo = new Rentangulo(15,8);
        
        double area = rentangulo.calcularArea(15,8);
        double perimetro = rentangulo.calcularPerimetro(15,8);
        
        System.out.println("El area del rectangulo es: "+ area);
        System.out.println("El perimetro del rectangulo es: "+ perimetro);
        
        System.out.println("*********************************");
        
        Empleado empleado = new Empleado(1000,200,10);
        
        double salario = empleado.calcularSalario(1000,200,10);
        System.out.println("El salario del empleado es: "+salario);
        
        System.out.println("*********************************");

        CalculadoraImpuestos calculadoraImpuestos = new CalculadoraImpuestos(200, 1000.5, 0.3, 100.);

        double impuesto = calculadoraImpuestos.calcularImpuestos(1000, 0.3, 100);
        System.out.println("Los impuestos a pagar son: " + impuesto);

    }
}
