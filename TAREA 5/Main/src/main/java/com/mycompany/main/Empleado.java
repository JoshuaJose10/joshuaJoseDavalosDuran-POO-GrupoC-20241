package com.mycompany.main;

public class Empleado {
    private double sueldoBase;
    private double bonificacion;
    private int horasExtra;

    public Empleado(double sueldoBase, double bonificacion, int horasExtra) {
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
        this.horasExtra = horasExtra;
    }
    
    public double calcularSalario(double sueldoBase){
        return sueldoBase;
    }
    public double calcularSalario(double sueldoBase, double bonificacion){
        return sueldoBase + bonificacion;
    }
    public double calcularSalario(double sueldoBase, double bonificacion, int horasExtras){
        return sueldoBase + bonificacion + (horasExtras*20);
    }
}
