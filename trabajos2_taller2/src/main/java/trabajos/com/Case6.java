package trabajos.com;
import java.util.Scanner;
public class Case6{
        public static int case6() {
            Scanner sc = new Scanner(System.in); 
                int number1;
                int number2;
                int number3;
                System.out.print("ingrese un numero = ");
                number1 = sc.nextInt();
                System.out.println();
                int i = 0;
                while (i < 11) {
                    number2 = number1 * i++;
                    number3 = i- 1;
                    System.out.println(+number1+" X "+number3+" = "+number2);
                }
                return number1;
    }
}