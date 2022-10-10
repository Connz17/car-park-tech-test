package org.example;

import java.util.ArrayList;

public class CarPark {


    private ArrayList<Vehicle> carPark = new ArrayList<>();

    public ArrayList<Vehicle> getCarPark() {
        return carPark;
    }

    public void addVehicle (Vehicle vehicle){
        this.carPark.add(vehicle);
    }


    public void listVehicles(){
        for (Vehicle vehicle : carPark) {
            System.out.println("Vehicle: " + vehicle);
        }
    }

    public void numberOfVehicles(){
            System.out.println(carPark.size());
    }



}
