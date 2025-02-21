package com.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class landa {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("java"); // permite datos duplicados

        System.out.println("ArrayList"+ arrayList);

        //linkedlist (rapido para intercesiones y eliminaciones)
        List<String> linkeList = new LinkedList<>(arrayList);
        linkeList.add("C++");

        System.out.println("linkeList" + linkeList);
    }
}
