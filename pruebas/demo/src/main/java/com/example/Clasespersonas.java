package com.example;
import java.util.Map;
import java.util.TreeMap;
public class Clasespersonas {
    public static void main(String[] args) {
        // Crear un TreeMap con claves String y valores Integer
    TreeMap<String,Integer> edades = new TreeMap<>();
    // Agregar elementos (se almacenan en orden ascendente)
    edades.put("johlver", 28);
    edades.put("manues", 32);
    edades.put("jennifer", 24);
    edades.put("consuelo", 30);
    // Imprimir el TreeMap (ya está ordenado)
    System.out.println("treemap ordenado");
    for (Map.Entry<String, Integer> entry : edades.entrySet()){
        System.out.println(entry.getKey()+"->"+entry.getValue());
        System.out.println("Edad de Carlos: " + edades.get("Jennifer")); // 24
        System.out.println("Primera clave: " + edades.firstKey()); // Consuelo
        System.out.println("Última clave: " + edades.lastKey()); // Manuel
    }
}}
