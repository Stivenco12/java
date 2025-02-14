package com.example;
import java.util.Random;
public class Ramdob {
    public static void main(String[] args) {
        String caracteres = "1234567890¿qwertyuiop+asdfghjklñ{}zxcvbnm,.-!#$%&/()=¨¨*[]<>QWERTYUIOPASDFGHJKLÑZXCVBNM";
        Random random = new Random();
        StringBuilder contraseña = new StringBuilder();
        for(int i = 0; i < 10; i++){
            int indice = random.nextInt(caracteres.length());
            contraseña.append(caracteres.charAt(indice));
        }
        System.out.println("contraseña = "+contraseña.toString());
    }
}
