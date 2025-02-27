package com.example.factory;

import com.example.Vehicle;
import com.example.models.Truck;

public class TruckFactory extends VehicleFactory {
    @Override 
    public Vehicle createVehicle(){
        return new Truck();
    }
}
