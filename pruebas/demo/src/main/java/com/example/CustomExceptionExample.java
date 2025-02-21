package com.example;

class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
    super(mensaje);
    }
 }
public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
        validarEdad(15);
        }catch (MiExcepcion e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Genera ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Acceso fuera de los límites del array.");
        }
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
            } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
            } finally {
            System.out.println("Este bloque siempre se ejecuta.");
            }
    }
    public static void validarEdad(int edad) throws MiExcepcion {
        if (edad < 18) {
            throw new MiExcepcion("Debe ser mayor de edad.");
        }
        System.out.println("Edad válida.");
        
    }
}