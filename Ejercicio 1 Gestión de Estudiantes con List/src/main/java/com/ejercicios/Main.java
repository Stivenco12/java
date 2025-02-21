package com.ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String menu = "1";
            do{
                List<String> nombres = new ArrayList<>();
                System.out.println("Ingrese la cantidad de estudiantes que desea registrar");
                int cantidad = sc.nextInt();

                for(int i = 0; i <= cantidad; i++){
                    System.out.println("ingresa el nombre del estudiante "+i);
                    String name = sc.nextLine();
                    nombres.add(name);
                }

                System.out.print("Quieres buscar un nombre \n1. si\n2. no \nElije =  ");
                int buscar = sc.nextInt();
                sc.nextLine();
                if (buscar == 1) {
                    System.out.print("ingrese el nombre que quiere buscar = ");
                    sc.next();
                    String namese = sc.nextLine();
                    boolean existe = nombres.contains(namese);

                    if (existe == true) {
                        System.out.println("El nombre que buscas si existe");
                    }else{
                        System.out.println("El nombre que buscas no existe");
                    }
                }

                Collections.sort(nombres);
                System.out.println("\nLista ordenada: " + nombres);
                System.out.println();               
            }while(!menu.equals("2"));   
          
        }catch (Exception e) {
            System.out.println("error por favor vuelve a ejecutrar el programa");
        }
    }
}