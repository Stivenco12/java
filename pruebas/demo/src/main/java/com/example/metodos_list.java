package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class metodos_list {
    public static void main(String[] args) {
        // 1️⃣ Crear una lista de nombres
        List<String> nombres = new ArrayList<>();

        // 2️⃣ Agregar elementos con add()
        nombres.add("Carlos");
        nombres.add("ana");
        nombres.add("pedro");
        nombres.add("laura");
        nombres.add("maria");
        System.out.println("lista Inicial: "+nombres);
        // 3️⃣ Acceder a un elemento con get()
        System.out.println("Elemento en indece 2:"+nombres.get(2)) ; // pedro

        // 4️⃣ Modificar un elemento con set()
        nombres.add(1,"andrea"); // remplaza ana por andrea
        System.out.println("lista depues de modificacion: "+nombres);

        // 5️⃣ Insertar un elemento en una posición específica
        nombres.add(2,"fernando");
        System.out.println("lista despues de incertar en el indice 2: "+nombres);

        // 6️⃣ Eliminar un elemento por índice
        nombres.remove(3);//Elemina "pedro  "
        System.out.println("lista despues de eliminar en indice 3:" +nombres);

        // 7️⃣ Buscar un elemento con contains()
        boolean existeLaura = nombres.contains("laura");
        System.out.println("laura existe en esta lista " + existeLaura);

        // 8️⃣ Buscar la posición de un elemento con indexOf()
        int posiciónMaria = nombres.indexOf("maria");
        System.out.println("posicion de maria" +posiciónMaria);

        // 9️⃣ Iterar sobre la lista con diferentes métodos
        System.out.println("\n iterando con for clasisco");
        for (int i = 0; i <nombres.size(); i++){
            System.out.println(nombres.get(i));
        }
        System.out.println("\n iterando con for earhc");
        for (String nombre : nombres){
            System.out.println(nombre);
        }
        System.out.println("\n aterando con iterador");
        Iterator<String> iterator = nombres.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\n iterador con forehs Y lamda");
        nombres.forEach(nombre -> System.out.println(nombre));

        // 🔟 Ordenar la lista alfabéticamente con Collections.sort()

        Collections.sort(nombres);
        System.out.println("\nlista ordenada "+nombres);
        // 🔹 Verificar si la lista está vacía
        System.out.println("la lista esta vacia?"+nombres.isEmpty());
        // 🔹 Obtener el tamaño de la lista
        System.out.println("tamaño de la lista"+nombres.size());
        // 🔹 Limpiar la lista con clear()
        nombres.clear();
        System.out.println("lista despues de clear"+ nombres);
    }
}
