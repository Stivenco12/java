package com.example;

public class sobrecarga {
    public static int sumar(int a) {
        return a + 10;
    }
    public static int sumar(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sumar(5));
        System.out.println(sumar(5, 10));
    }
}
