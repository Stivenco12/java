package com.example.models;

import com.example.Vehicle;

public class Motorcycle implements Vehicle {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Motorcycle encendiendse");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Motorcycle apagandose");
    }

}
