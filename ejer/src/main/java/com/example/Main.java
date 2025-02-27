package com.example;

import com.example.factory.CarFactory;
import com.example.factory.MotorcycleFactory;
import com.example.factory.PlaneFactory;
import com.example.factory.TruckFactory;



public class Main {
    public static void main(String[] args) {
        Vehicle car = new CarFactory().createVehicle();
        Vehicle truck = new TruckFactory().createVehicle();
        Vehicle plane = new PlaneFactory().createVehicle();
        Vehicle motorcycle = new MotorcycleFactory().createVehicle();
        car.start();
        truck.start();
        plane.start();
        motorcycle.start();
    }
}