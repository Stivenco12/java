package trabajos.com.Cases;
import java.util.Scanner;

public class Case11 {
    public static int case11() {
        int case11 = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el saldo inicial de la cuenta = ");
        double saldo = sc.nextDouble();
        System.out.print("Ingrese el depósito mensual fijo = ");
        double depositoFijo = sc.nextDouble();
        System.out.print("Ingrese la tasa de interés anual (%) = ");
        double tasa = sc.nextDouble();
        System.out.print("Ingrese el número de meses de simulación = ");
        int meses = sc.nextInt();
        double interesMensual = (tasa / 100) / 12;
        System.out.println("\nMes   Saldo Inicial   Depósito   Interés   Saldo Final");
        System.out.println("------------------------------------------------------");
        for (int mes = 1; mes <= meses; mes++) {
            double interes = saldo * interesMensual;
            double saldoFinal = saldo + interes + depositoFijo;
            System.out.printf("%-5d %14.2f %10.2f %9.2f %13.2f\n", 
                mes, saldo, depositoFijo, interes, saldoFinal);
            saldo = saldoFinal; 
        }
        System.out.println();
        return case11;
    }
}
