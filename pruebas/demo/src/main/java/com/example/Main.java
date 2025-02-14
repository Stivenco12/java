package com.example;

public class Main {
    public static void main(String[] args) {
        String texto = "Programacion en java";
        // uso de metodos  comunes
        System.out.println("longitud:" + texto.length());
        System.out.println("caracter en pocision 5:" + texto.charAt(5));
        System.out.println("subcadena:" + texto.substring(1, 12));
        System.out.println("en minusculas: " + texto.toLowerCase());
        System.out.println("en mayusculas: " + texto.toUpperCase());
        System.out.println("sin espacios'"+ texto.trim()+ "'");
        System.out.println("remplazo:" + texto.replace('a', 'o'));
        System.out.println("Empieza con 'pro'?" + texto.trim().startsWith("pro"));
        System.out.println("¿contiene 'java'?" + texto.contains("java"));
    }
}