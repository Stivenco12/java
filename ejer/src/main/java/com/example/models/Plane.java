package com.example.models;

import com.example.Vehicle;

public class Plane implements Vehicle {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("encendiendo Plane");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("apagandose plane");
    }

}
