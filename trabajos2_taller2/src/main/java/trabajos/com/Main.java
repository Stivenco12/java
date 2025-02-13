package trabajos.com;
import java.util.Scanner;
import trabajos.com.Cases.Menu;
import trabajos.com.Cases.Case1;
import trabajos.com.Cases.Case2;
import trabajos.com.Cases.Case3;
import trabajos.com.Cases.Case4;
import trabajos.com.Cases.Case5;
import trabajos.com.Cases.Case6;
import trabajos.com.Cases.Case7;
import trabajos.com.Cases.Case8;
import trabajos.com.Cases.Case9;
import trabajos.com.Cases.Case10;
import trabajos.com.Cases.Case11;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 
            String menu;
            do{
                Menu.menu();
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
                    case "10" -> Case10.case10(); 
                    case "11" -> Case11.case11();
                    case "12" -> System.out.println("saliendoo.............");
                }
            }while(!menu.equals("12"));
        }
    }
}