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

        double r = interes / (12 * 100);
        System.out.println("Tasa de interés mensual: " + r);
        double n = plazo * 12;
        double c = (p * r) / (1 - Math.pow(1 + r, -n));
        System.out.println("Cuota mensual: " + String.format("%.2f", c));
        System.out.println();

        System.out.println("Cuota  Saldo Inicial  Cuota Mensual  Interés  Capital  Saldo Pendiente");
        System.out.println("----------------------------------------------------------------------");

        double saldo = p;
        for (int i = 1; i <= n; i++) {
            double interesMensual = saldo * r;
            double capital = c - interesMensual;
            saldo -= capital;

            System.out.printf("%-6d %12.2f %13.2f %8.2f %8.2f %14.2f\n",
                    i, p, c, interesMensual, capital, saldo);

            p = saldo;
        }

        return cases9;
    }
}
