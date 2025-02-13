package trabajos.com.Cases;
import java.util.Scanner;
public class Case4{
        public static int case4() {
            try (Scanner sc = new Scanner(System.in)) { 
                int entero;
                System.out.print("ingrese un numero entero = ");
                entero = sc.nextInt();
                if (entero % 2 == 0) {
                    System.out.println("es un numero es par");
                }else{
                    System.out.println("no es un numero par");
                }
                System.out.println();
                return entero;
            }
        }
}
