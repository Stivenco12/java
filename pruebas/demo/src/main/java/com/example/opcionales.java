package com.example;

import java.util.Optional;

public class opcionales {
    public static void saludar(Optional<String> nombre) {
        System.out.println("hola, " +nombre.orElse("invitado") + "!");
    }
    public static void main(String[] args) {
        saludar(Optional.of("Stiven"));
        saludar(Optional.empty());
    }
}
