package com.spring.spring;

import java.sql.Date;
import java.util.ArrayList;

public class Pedido {
    
    // Atributos de Pedido
    private int numPedido;
    private Date fecha;
    private Mesa mesa;
    private Camarero camarero;
    private ArrayList<Plato> platos;
    
    // Constructor de Pedido
    public Pedido(int numPedido, Date fecha, Mesa mesa, Camarero camarero, ArrayList<Plato> platos) {
        this.numPedido = numPedido;
        this.fecha = fecha;
        this.mesa = mesa;
        this.camarero = camarero;
        this.platos = platos;
    }
    
    public Pedido(int i, Mesa mesa1, Camarero camarero1, ArrayList<Plato> platos2) {
    }

    // Métodos Getter y Setter de Pedido
    public int getNumPedido() {
        return numPedido;
    }
    
    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public Mesa getMesa() {
        return mesa;
    }
    
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    public Camarero getCamarero() {
        return camarero;
    }
    
    public void setCamarero(Camarero camarero) {
        this.camarero = camarero;
    }
    
    public ArrayList<Plato> getPlatos() {
        return platos;
    }
    
    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }
    
    // Método para agregar un plato al pedido
    public void agregarPlato(Plato plato) {
        this.platos.add(plato);
    }
    
    // Método para eliminar un plato del pedido
    public void eliminarPlato(Plato plato) {
        this.platos.remove(plato);
    }
    
    // Método para calcular el total del pedido
    public double calcularTotal() {
        double total = 0;
        for (Plato plato : platos) {
            total += plato.getPrecio();
        }
        return total;
    }
    
}