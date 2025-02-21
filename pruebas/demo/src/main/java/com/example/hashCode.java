package com.example;


class Persona {
    String nombre;
    Persona(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public int hashCode() {
    return nombre.hashCode();
    }
}
    public class hashCode {
        public static void main(String[] args) {
            Persona p1 = new Persona("Johlver");
            System.out.println(p1.hashCode()); // Devuelve un número basado en "Johlver"
    }   
}