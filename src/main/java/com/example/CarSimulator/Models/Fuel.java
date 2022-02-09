package com.example.CarSimulator.Models;

public class Fuel {
    private int tank; // fuel measured in liter
    private int actualAmountOfFuel;
    private final int consumption; // consumption per 100 km

    public Fuel(int actualAmountOfFuel) {
        this.tank = 50;
        this.actualAmountOfFuel = actualAmountOfFuel;
        this.consumption = 6;
    }

    public int getTank() {
        return tank;
    }

    public int getActualAmountOfFuel() {
        return actualAmountOfFuel;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public void setActualAmountOfFuel(int actualAmountOfFuel) {
        this.actualAmountOfFuel = actualAmountOfFuel;
    }

}
