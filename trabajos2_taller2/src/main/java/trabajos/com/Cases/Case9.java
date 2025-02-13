package trabajos.com.Cases;

import java.util.Scanner;

public class Case9 {
    public static int case9() {
        int cases9 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el monto del préstamo: ");
        double p = sc.nextDouble();
        System.out.print("Ingrese la tasa de interés anual (%): ");
        double interes = sc.nextDouble();
        System.out.print("Ingrese el plazo del préstamo (en años): ");
        double plazo = sc.nextDouble();
        double r = interes / (10 * 100);
        System.out.println("Tasa de interés mensual: " + r);
        double n = plazo * 12;
        double c = (p * r) / (1 - Math.pow(1 + r, -n));
        System.out.println("Cuota mensual: " + String.format("%.2f", c));
        System.out.println();
        return cases9;
    }
}
