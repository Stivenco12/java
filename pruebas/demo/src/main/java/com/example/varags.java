package com.example;

public class varags {
    public static void imprimirnombres(String... nombres) {
        for(String nombre : nombres){
            System.out.println("hola, " +nombre+"!");
        }
    }
    public static void main(String[] args) {
        imprimirnombres("johver","jose","Spock","consuelo");        
        imprimirnombres();
    }
}
