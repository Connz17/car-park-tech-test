package org.example;

public class Van extends Vehicle{

    public Van(int wheels, int doors) {
        super(wheels, doors);
    }

    public VehicleType getType(){
        return VehicleType.van;
    }
}
