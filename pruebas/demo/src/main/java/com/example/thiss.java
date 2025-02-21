package com.example;

 class personas{
    String nombre;
    personas(String nombre ){
        this.nombre = nombre;
    }
    void mostrar(){
        System.out.println("nombre " +this.nombre);
    }
}
public class thiss {
    public static void main(String[] args) {
        personas p = new personas("juan");
        p.mostrar();
    }
    
}