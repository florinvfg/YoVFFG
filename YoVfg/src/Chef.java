package com.spring.spring;

public class Chef extends Empleado {
    
    // Atributos de Chef
    private int anosExperiencia;
    private boolean tieneTitulacion;
    
    // Constructor de Chef
    public Chef(String nombre, int id, String puesto, String direccion, String telefono, int anosExperiencia, boolean tieneTitulacion) {
        super(nombre, id, puesto, direccion, telefono);
        this.anosExperiencia = anosExperiencia;
        this.tieneTitulacion = tieneTitulacion;
    }
    
    public Chef(int i, String string, String string2, String string3, int j, String string4) {
    }

    // Métodos Getter y Setter de Chef
    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    public boolean isTieneTitulacion() {
        return tieneTitulacion;
    }
    
    public void setTieneTitulacion(boolean tieneTitulacion) {
        this.tieneTitulacion = tieneTitulacion;
    }
    
    // Implementación del método abstracto de Empleado para calcular el salario de Chef
    @Override
    public double calcularSalario() {
        double salarioBase = 2000;
        double salarioExperiencia = this.anosExperiencia * 100;
        double salarioTitulacion = this.tieneTitulacion ? 500 : 0;
        return salarioBase + salarioExperiencia + salarioTitulacion;
    }

    public void cocinarPlato(Plato plato1) {
    }
    
}.