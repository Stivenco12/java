package com.example.models;

import com.example.Vehicle;

public class Truck implements Vehicle {

    @Override
    public void start() {
 
        System.out.println("arrancando camion");
    }

    @Override
    public void stop() {
   
        System.out.println("apagando camion");
    }

}
