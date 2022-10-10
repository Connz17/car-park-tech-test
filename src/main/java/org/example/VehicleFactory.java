package org.example;

public class VehicleFactory {

    public Vehicle createVehicle(VehicleType type){
            switch(type){
                case car:
                    return new Car(4,4);
                case motorcycle:
                    return new Motorcycle(2,0);
                case van:
                    return new Van(4,2);
            }

        return null;
    }
}
