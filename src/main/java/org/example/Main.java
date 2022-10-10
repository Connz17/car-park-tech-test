package org.example;

import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();


    public static void main(String[] args) {



        VehicleFactory factory = new VehicleFactory();
        CarPark carPark = new CarPark();

        for(int i = 0; i < 7; i++) {

            switch (RANDOM.nextInt(3)) {

                case 0:
                    carPark.addVehicle(factory.createVehicle(VehicleType.car));
                    break;

                case 1:
                    carPark.addVehicle(factory.createVehicle(VehicleType.motorcycle));
                    break;

                case 2:
                    carPark.addVehicle(factory.createVehicle(VehicleType.van));
                    break;
            }

        }



        carPark.listVehicles();
        carPark.numberOfVehicles();


    }
}