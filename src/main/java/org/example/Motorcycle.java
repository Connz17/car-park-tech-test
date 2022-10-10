package org.example;

public class Motorcycle extends Vehicle{
    public Motorcycle(int wheels, int doors) {
        super(wheels, doors);
    }

public VehicleType getType(){
        return VehicleType.motorcycle;
}
}
