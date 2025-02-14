package com.example;

public class Prueva1 {
    public static void main(String[] args) {
        String texto = "Aprender java es divertido y util";
        String subcadena1 = texto.substring((11));
        System.out.println("subcadena 1: " + subcadena1);

        String subcadena2 = texto.substring(11, 15);
        System.out.println("subcadena 2: " + subcadena2);

        String textolimpio = texto.trim();
        String subcadena3 = textolimpio.substring(0,8);
        System.out.println("subcadena 3" + subcadena3);

        int pocisionjava = texto.indexOf("java");
        String subcadena4 = texto.substring(pocisionjava, pocisionjava + 4);
        System.out.println("subcadena 4: " + subcadena4);

        String subcadena5 = texto.trim().substring(9).toUpperCase();
        System.out.println("subcadena 5:" + subcadena5);

        if (texto.length() > 20) {
            String subcadena6 = texto.substring(0,20);
            System.out.println("subcadena 6 : " + subcadena6);
        }

        String nombre = "Juan";
        int edad = 30;
        String mensaje = String.format("Mi nombre es %s y tengo %d años",nombre, edad);
        System.out.println(mensaje);
    }
}
