package com.zoho;

public class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(String name, String colour, int engineCapacity) {
        super(name, colour);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        System.out.println(getName() + " is starting with a powerful rev!");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is cruising through the streets.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Engine Capacity: " + engineCapacity + "cc";
    }
}
