package com.example;

class objeto {
    static int contador = 0 ;
    objeto(){
        contador++;
    }
    void mostrarcontador() {
        System.out.println("contador = "+contador );
    }
}

public class dar {
    public static void main(String[] args) {
        objeto e1 = new objeto();
        objeto e2 = new objeto();

        e1.mostrarcontador();
        e2.mostrarcontador();
    }
    
}