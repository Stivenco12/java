package com.example.factory;

import com.example.Vehicle;
import com.example.models.Motorcycle;

public class MotorcycleFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle(){
        return new Motorcycle();
    }
}
