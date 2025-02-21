package com.example;
class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
    super(mensaje);
    }
 }
public class exception {
    public static void main(String[] args) {
        try {
            String ogh = "viva la vida loca";
            int longitud = ogh.length();
            if (longitud > 10 ) {
                throw new MiExcepcion("Debe tener menos caracteres.");
            }
        }catch (MiExcepcion e) {
                System.out.println("Error: " + e.getMessage());
        }
        try{
            String ogh = "viva la vida loca";
            char o = 1;
            char letra = ogh.charAt(1);
            if (letra != o) {
                throw new MiExcepcion("Debes elejir otra.");
                
            }
        }catch (MiExcepcion e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
