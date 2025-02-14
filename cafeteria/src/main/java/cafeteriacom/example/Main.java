package cafeteriacom.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 
            String menu;
            do{
                System.out.println("=======================================\n  SIMULADOR DE PROPINA\n=======================================");
                System.out.println("1. Calcular propina y total a pagar\n2. Calcular total a pagar divido entre varias personas\n3. Salir\n=======================================");
                System.out.print("Por favor, elige una opción (1-3) = ");
                menu = sc.nextLine();
                switch (menu) { 
                    case "1":
                        String case1;
                        do{
                            System.out.println("=============================================\nCálculo de Propina\n=============================================");
                            System.out.print("Ingrese el monto total de la cuenta: $" );
                            double monto = sc.nextDouble();
                            System.out.print("Ingrese el porcentaje de propina (por ejemplo: 15): %");
                            double propina = sc.nextDouble();
                            System.out.println("=============================================");
                            double porcentaje = (monto*propina)/100;
                            System.out.println("La propina calculada es: $"+porcentaje);
                            double total_pagar = monto+porcentaje; 
                            System.out.println("El total a pagar es: $"+total_pagar);
                            System.out.println("=============================================");
                            System.out.print("¿Deseas calcular nuevamente? (S/N) = ");
                            sc.next();
                            case1 = sc.nextLine();
                        }while(case1 == "N" | case1 == "S");   
                        break;
                    case "2":   
                        break;
                }
            }while(!menu.equals("3"));
        }
    }
}