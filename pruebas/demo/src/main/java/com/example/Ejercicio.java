package com.example;
import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String Titulo;
            String Autor;
            int Año_publicasion;
            String Genero;
            int Numero_paginas;
            System.out.println("*** Gestion de libros en la biblioteca ***");
            System.out.println("Ingresa el titulo del libro: ");
            Titulo = sc.nextLine();    
            System.out.println("Ingresa el titulo del autor del libro: ");
            Autor = sc.nextLine();
            System.out.println("Ingresa el año de publicacion del libro: ");
            Año_publicasion = sc.nextInt();
            System.out.println("Ingresa el genero del libro: ");
            Genero = sc.nextLine();
            System.out.println("Ingresa el numero de paginas del libro");
            Numero_paginas = sc.nextInt();
            System.out.println("--- Informacion del libro ---");
            System.out.println("Titulo: "+Titulo+"\nAutor: "+Autor+"\nAño de publicacion: "+Año_publicasion+"\nGenero: "+Genero+"\nNumero de paginas"+Numero_paginas);
        }
    }
}