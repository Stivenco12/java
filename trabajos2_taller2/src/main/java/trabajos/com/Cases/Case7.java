package trabajos.com.Cases;
import java.util.Random;
import java.util.Scanner;
public class Case7{
        public static int case7() {
            Scanner sc = new Scanner(System.in); 
                System.out.println("adivinar el numero del 0 al 100");
                Random random = new Random();
                int intAletorio = random.nextInt(101);
                int numero0;
                System.out.print("ingresa un numero del 0 al 100 = ");
                numero0 = sc.nextInt();
                if (numero0 == intAletorio) {
                    System.out.println("ganastes el numero que salio fue "+intAletorio+" y el numero que elegistes es "+numero0);
                }else{
                    System.out.println("perdistes el numero que salio fue "+intAletorio+" y el numero que elegistes es "+numero0);
                }
                System.out.println();
                return numero0;
        } 
}
