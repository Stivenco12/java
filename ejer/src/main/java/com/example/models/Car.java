package com.example.models;

import com.example.Vehicle;

public class Car implements Vehicle {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Car encendiendose");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Car apagandose");
    }
    
}
