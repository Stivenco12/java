package trabajos.com.Cases;

import java.util.Scanner;

public class Case8 {
    public static int case8() {
        @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
                int limite = 100;
                int start ;
                int end;
                System.out.print("ingrese un texto = ");
                String s = sc.nextLine();
                System.out.print("ingrese el inicio de la cadena = ");
                start = sc.nextInt();
                System.out.print("ingrese el final de la cadena = ");
                end = sc.nextInt();
                if (s.length() > limite) {
                    s = s.substring(0, limite);
                    System.out.println("el texto cumple el limite");
                    
                }if (!s.matches("[a-zA-Z ]+")) {
                    System.out.println("El texto es válido.");
                    System.out.println(s.substring(start, end));
                    System.out.println();
                }  
            System.out.println();
            return end;
        }
    }

