package com.spring.spring;

public class Plato {
 // Atributos de Plato
 private int id;
 private String nombre;
 private String descripcion;
 private double precio;
 
 // Constructor de Plato
 public Plato(int id, String nombre, String descripcion, double precio) {
     this.id = id;
     this.nombre = nombre;
     this.descripcion = descripcion;
     this.precio = precio;
 }
 
 // Métodos Getter y Setter de Plato
 public int getId() {
     return id;
 }
 
 public void setId(int id) {
     this.id = id;
 }
 
 public String getNombre() {
     return nombre;
 }
 
 public void setNombre(String nombre) {
     this.nombre = nombre;
 }
 
 public String getDescripcion() {
     return descripcion;
 }
 
 public void setDescripcion(String descripcion) {
     this.descripcion = descripcion;
 }
 
 public double getPrecio() {
     return precio;
 }
 
 public void setPrecio(double precio) {
     this.precio = precio;
 }
 
}
