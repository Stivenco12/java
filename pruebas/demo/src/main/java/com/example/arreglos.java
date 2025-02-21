package com.example;

import java.util.Scanner;

public class arreglos {
    public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("nombres");
                String no ;
                no = sc.nextLine();
                String[] arreglos = {no,"taliana","dañana","helen","windred","sahian"};
                for ( int i = 0; i < arreglos.length; i++){
                    System.out.println("nombres = " + arreglos[i]);
                }
                System.out.println();
                // for-each
                for(String arreglo : arreglos){
                    System.out.println("nombres = "+ arreglo);
                }
                System.out.println();
                // saber tamaño de un arreglo
                System.out.println("el tamaño del arreglo es " +arreglos.length);
            }
    }
}
