package trabajos.com.Cases;

import java.util.Scanner;

public class Case3 {
        public static int case3() {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            int case3 = 0;
            System.out.print("por favor ingrese su nombre = ");
            String nombre = sc.nextLine();
            System.out.print("por favor ingrese su edad = ");
            int edad = sc.nextInt();
            System.out.println("Su nombre es "+nombre+" y su edad es de "+edad);
            System.out.println("");
            return case3;
        
    }
}
