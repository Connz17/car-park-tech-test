package org.example;

public class Car extends Vehicle{
    public Car(int wheels, int doors) {
        super(wheels, doors);
    }

    public VehicleType getType(){
        return VehicleType.car;
    }
}
