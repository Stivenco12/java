package trabajos.com;
import java.util.Scanner;
import java.util.Random;
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
                System.out.println("Ejercicio 9 = Generar la tabla de Amortizacion de un prestamo Bancario");
                menu = sc.nextLine();
                switch (menu) { 
                    case "1":
                        System.out.println("hola java!");
                        System.out.println("");
                        break;
                    case "2":
                        int Nm0 = 10;
                        double Nm1 = 1.0;
                        char Nm2 = 127;
                        boolean Nm3 = true;
                        System.out.println("Valor int ="+Nm0+"\nValor double = "+Nm1+"\nValor char = "+Nm2+"\nValor boolean = "+Nm3);
                        System.out.println("");
                        break;
                    case "3":
                        String nombre;
                        int edad;
                        System.out.println("por favor ingrese su nombre");
                        nombre = sc.nextLine();
                        System.out.println("por favor ingrese su edad");
                        edad = sc.nextInt();
                        System.out.println("Su nombre es "+nombre+" y su edad es de "+edad);
                        System.out.println("");
                        break;
                    case "4":
                        int entero;
                        System.out.println("ingrese un numero entero = ");
                        entero = sc.nextInt();
                        if (entero % 2 == 0) {
                            System.out.println("es un numero es par");
                        }else{
                            System.out.println("no es un numero par");
                        }
                        break;
                    case "5":
                        for(int i = 1; i <= 10; i++){
                            System.out.println("numero: "+ i);
                        }
                        break;
                    case "6":
                        int number1;
                        int number2;
                        int number3;
                        System.out.println("ingrese un numero = ");
                        number1 = sc.nextInt();
                        System.out.println();
                        int i = 0;
                        while (i < 11) {
                            number2 = number1 * i++;
                            number3 = i- 1;
                            System.out.println(+number1+" X "+number3+" = "+number2);
                        }
                        break;
                    case "7":
                        System.out.println("adivinar el numero del 0 al 100");
                        Random random = new Random();
                        int intAletorio = random.nextInt(101);
                        int numero0;
                        System.out.println("ingresa un numero del 0 al 100");
                        numero0 = sc.nextInt();
                        if (numero0 == intAletorio) {
                            System.out.println("ganastes el numero que salio fue "+intAletorio+" y el numero que elegistes es "+numero0);
                        }else{
                            System.out.println("perdistes el numero que salio fue "+intAletorio+" y el numero que elegistes es "+numero0);
                        }
                        System.out.println();
                        break;
                    case "9":
                        double p;
                        double interes;
                        double plazo;
                        double c;
                        double r;
                        double n;
                        p = sc.nextInt();
                        interes = sc.nextInt();
                        plazo = sc.nextInt();
                        r=((interes)/(12*100));
                        System.out.println(r);
                        n = plazo*12;
                        c=((p*r)/(1-(1*r)*(-n)));
                        System.out.println(c/2);
                        
                        break;
                }
            }while(!menu.equals("18"));
        }
    }
}