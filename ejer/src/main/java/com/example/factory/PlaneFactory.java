package com.example.factory;

import com.example.Vehicle;
import com.example.models.Plane;

public class PlaneFactory extends VehicleFactory {
    @Override 
    public Vehicle createVehicle(){
        return new Plane();
    }
}
