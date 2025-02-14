package trabajos.com.Cases;
import java.util.Scanner;

public class Case10 {
    public static int case10() {
        int case10 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el monto inicial de inversión = ");
        double P = sc.nextDouble();
        System.out.print("Ingrese la tasa de interés anual (%) = ");
        double r = sc.nextDouble() / 100;
        System.out.print("Ingrese el número de años de inversión = ");
        int t = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Seleccione la frecuencia de capitalización:");
        System.out.println("1. Mensual");
        System.out.println("2. Trimestral");
        System.out.println("3. Semestral");
        System.out.println("4. Anual");
        System.out.print("Opción = ");
        int opcion = sc.nextInt();
        int n; 
        switch (opcion) {
            case 1 -> n = 1;
            case 2 -> n = 3;
            case 3 -> n = 6;
            case 4 -> n = 12;
            default -> {
                System.out.println("Opción no válida.");
                return case10;
            }
        }
        System.out.println("\nAño    Capital Inicial   Interés Ganado   Saldo Final");
        System.out.println("------------------------------------------------------");
        double saldo = P;
        for (int i = 1; i <= t; i++) {
            double saldoFinal = P * Math.pow(1 + (r / n), n * i);
            double interesGanado = saldoFinal - saldo;
            System.out.printf("%-6d %15.2f %15.2f %15.2f\n", i, saldo, interesGanado, saldoFinal);
            saldo = saldoFinal; 
        }
        System.out.println();
        return case10;
    }
}

