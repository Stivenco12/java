package com.example.models;

import com.example.Vehicle;

public class Truck implements Vehicle {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("arrancando camion");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("apagando camion");
    }

}
