package com.mycompany.main;

public class CalculadoraImpuestos {
    private int ingresos; 
    private double porcentajeImpuestos;
    private double dividendos;
    private double exencion;

    public CalculadoraImpuestos(int ingresos, double porcentajeImpuestos, double dividendos, double exencion) {
        this.ingresos = ingresos;
        this.porcentajeImpuestos = porcentajeImpuestos;
        this.dividendos = dividendos;
        this.exencion = exencion;
    }
    
    public double calcularImpuestos(int ingresos){
        return ingresos * 0.15;
    }
    public double calcularImpuestos(int ingresos, double porcentajeImpuestos){
        return ingresos * (porcentajeImpuestos / 100);
    }
    public double calcularImpuestos(double dividendos, double porcentajeImpuestos, double exencion){
        double impuestos = dividendos * (porcentajeImpuestos / 100);
        
        if (impuestos > exencion) {
            return impuestos - exencion;
        }else{
            return 0;
        }
    }
}
