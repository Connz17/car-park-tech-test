package org.example;

import java.util.ArrayList;

public class CarPark {



    public CarPark() {

    }

//    public generateCarPark(){
//        carPark.add()
//    }




    private ArrayList<Vehicle> carsParked = new ArrayList<>();

    private ArrayList<Space> carPark = new ArrayList<>();

    public ArrayList<Vehicle> getCarPark() {
        return carsParked;
    }

    public void addVehicle (Vehicle vehicle){
        this.carsParked.add(vehicle);
    }

    public void addSpace (Space space){
        this.carPark.add(space);
    }

    public void listVehicles(){
        for (Vehicle vehicle : carsParked) {
            System.out.println("Vehicle: " + vehicle);
        }
    }

    public void numberOfVehicles(){
            System.out.println(carsParked.size());
    }


}
