package com.spring.spring;

public class Camarero extends Empleado{
    
    // Atributos de Camarero
    private int numMesasAsignadas;
    private boolean tienePropinas;
    
    // Constructor de Camarero
    public Camarero(String nombre, int id, String puesto, String direccion, String telefono, int numMesasAsignadas, boolean tienePropinas) {
        super(nombre, id, puesto, direccion, telefono);
        this.numMesasAsignadas = numMesasAsignadas;
        this.tienePropinas = tienePropinas;
    }
    

    

    public Camarero(int i, String string, String string2, String string3, int j, String string4) {
    }




    // Métodos Getter y Setter de Camarero
    public int getNumMesasAsignadas() {
        return numMesasAsignadas;
    }
    
    public void setNumMesasAsignadas(int numMesasAsignadas) {
        this.numMesasAsignadas = numMesasAsignadas;
    }
    
    public boolean isTienePropinas() {
        return tienePropinas;
    }
    
    public void setTienePropinas(boolean tienePropinas) {
        this.tienePropinas = tienePropinas;
    }
    
    // Implementación del método abstracto de Empleado para calcular el salario de Camarero
    @Override
    public double calcularSalario() {
        double salarioBase = 1000;
        double salarioMesas = this.numMesasAsignadas * 50;
        double salarioPropinas = this.tienePropinas ? 100 : 0;
        return salarioBase + salarioMesas + salarioPropinas;
    }

    public void tomarPedido(Pedido pedido1) {
    }

    public void servirPlato(Plato plato1) {
    }
    
}