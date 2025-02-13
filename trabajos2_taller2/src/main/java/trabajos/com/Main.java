package trabajos.com;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 
            String menu;
            do{
                System.out.println("Ejercicio 1 = hola java");
                System.out.println("Ejercicio 2 = Declaracion de variables");
                System.out.println("Ejercicio 3 = Entrada de datos con scanner");
                System.out.println("Ejercicio 4 = Condiciones If/else");
                System.out.println("Ejercicio 5 = Estructura repetitivas (for)");
                System.out.println("Ejercicio 6 = Tabalas de multiplicar con while");
                System.out.println("Ejercicio 7 = Adivina el numero (Ramdon)");
                System.out.println("Ejercicio 8 = Subcadena");
                System.out.println("Ejercicio 9 = Generar la tabla de Amortizacion de un prestamo Bancario");
                menu = sc.nextLine();
                switch (menu) { 
                    case "1" -> Case1.case1();
                    case "2" -> Case2.case2();
                    case "3" -> Case3.case3();
                    case "4" -> Case4.case4();
                    case "5" -> Case5.case5();
                    case "6" -> Case6.case6();
                    case "7" -> Case7.case7();
                    case "8" -> Case8.case8();
                    case "9" -> Case9.case9();
                }
            }while(!menu.equals("11"));
        }
    }
}