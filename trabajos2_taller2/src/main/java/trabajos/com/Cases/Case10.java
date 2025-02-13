package trabajos.com.Cases;
import java.util.Scanner;
public class Case10 {
    public static int case10() {
        int case10 = 0;
        double A ;
        double r;
        double n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el monto inicial de inversion = ");
        double P = sc.nextDouble();
        System.out.print("Ingrese la tasa de interes anual (%) = ");
        double interes = sc.nextDouble();
        System.out.print("Ingrese la numero de años de inversion = ");
        double t = sc.nextDouble();
        System.out.println("Seleccione la frecuencia de capitalizacion");
        System.out.println("1. Mensual");
        System.out.println("2. Trismestral");
        System.out.println("3. Semestral");
        System.out.println("4. Anual");
        System.out.print("Opcion = ");
        String menu = sc.nextLine();
        r = interes / 100;
        do{
            menu = sc.nextLine();
                switch (menu) { 
                    case "1":
                        n = 1;
                        A =  P * Math.pow(1 + (r / n), n * t);
                        System.out.println(A);
                    break;
                    case "2":
                        n = 3;
                        A =  P * Math.pow(1 + (r / n), n * t);
                        System.out.println(A);
                    break;
                    case "3":
                        n = 6;
                        A =  P * Math.pow(1 + (r / n), n * t);
                        System.out.println(A);
                    break;
                    case "4":
                        n = 12;
                        A =  P * Math.pow(1 + (r / n), n * t);
                        System.out.println(A);
                    break;
                }
                
        }while(!menu.equals("11"));
        System.out.println();
        return case10;
    }
}
