package com.example.factory;

import com.example.Vehicle;
import com.example.models.Car;

public class CarFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle(){
        return new Car();
    }
}
