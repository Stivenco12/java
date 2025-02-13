package trabajos.com.Cases;
import java.util.Scanner;
public class Case11 {
    public static int case11() {
        int case11 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el saldo inicial de la cuenta = ");
        double saldo = sc.nextDouble();
        System.out.print("Ingrese el deposito mensual fijo = ");
        double fijo_deposito = sc.nextDouble();
        System.out.print("Ingrese la tasa de interes anual (%)  = ");
        double tasa = sc.nextDouble();
        System.out.print("Ingrese el numero de meses de simulacion = ");
        double frecuencia = sc.nextDouble();
        double interes_mensual;
        double saldo_actual;
        double saldo_final;
        saldo_actual = saldo+(fijo_deposito * frecuencia);
        interes_mensual = (tasa/100) / 12 * saldo_actual  ;
        saldo_final = saldo_actual + interes_mensual;
        System.out.printf("%.0f %.2f %.2f %.2f %.2f\n", 
        frecuencia, saldo_actual, fijo_deposito, interes_mensual, saldo_final);
        System.out.println();
        return case11;
    }
}