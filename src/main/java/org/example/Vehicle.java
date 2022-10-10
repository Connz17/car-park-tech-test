package org.example;

public abstract class Vehicle {

    protected int wheels;
    protected int doors;

    public Vehicle(int wheels, int doors) {
        this.wheels = wheels;
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +":" +
                " Wheels=" + wheels +
                ", Doors=" + doors + "\n";
    }
}
