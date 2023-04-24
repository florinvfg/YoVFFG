package com.spring.spring;

public class Cocinero extends Empleado {
    
    // Atributos de Cocinero
    private String especialidad;
    private boolean tieneUniforme;
    
    // Constructor de Cocinero
    public Cocinero(String nombre, int id, String puesto, String direccion, String telefono, String especialidad, boolean tieneUniforme) {
        super(nombre, id, puesto, direccion, telefono);
        this.especialidad = especialidad;
        this.tieneUniforme = tieneUniforme;
    }
    
    
    

    public Cocinero(int i, String string, String string2, String string3, int j, String string4) {
    }




    // Métodos Getter y Setter de Cocinero
    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public boolean isTieneUniforme() {
        return tieneUniforme;
    }
    
    public void setTieneUniforme(boolean tieneUniforme) {
        this.tieneUniforme = tieneUniforme;
    }
    
    // Implementación del método abstracto de Empleado para calcular el salario de Cocinero
    @Override
    public double calcularSalario() {
        double salarioBase = 1500;
        double salarioUniforme = this.tieneUniforme ? 100 : 0;
        return salarioBase + salarioUniforme;
    }

    public void prepararPlato(Plato plato1) {
    }
    
}
