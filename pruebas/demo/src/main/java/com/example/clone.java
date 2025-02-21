package com.example;

class Persona implements Cloneable {
    String nombre;
    Persona(String nombre) {
        this.nombre = nombre;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class clone {
    public static void main(String[] args) throws CloneNotSupportedException {
    Persona p1 = new Persona("Johlver Pardo");
    Persona p2 = (Persona) p1.clone();
    System.out.println(p1.nombre); // Johlver Pardo
    System.out.println(p2.nombre); // Johlver Pardo
    }
}