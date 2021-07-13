package com.caeerdevs.vehicle;

import com.caeerdevs.Engine;
import com.caeerdevs.Passenger;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    protected Engine engine;
    private final String type;
    private boolean isLand;
    private boolean isWater;
    private boolean isAir;
    private boolean isSpace;
    protected List<Passenger> passengers;


    public Vehicle(Engine engine, String type, boolean isLand, boolean isWater, boolean isAir,
                   boolean isSpace) {
        this.engine = engine;
        this.type = type;
        this.isLand = isLand;
        this.isWater = isWater;
        this.isAir = isAir;
        this.isSpace = isSpace;
        this.passengers = new ArrayList<>();
    }

    public boolean turnOn(){
        return true;
    }

    public boolean turnOff(){
        return false;
    }

    public void addPassenger(Passenger name){
        passengers.add(name);
    }

    public void removePassenger(Passenger name){
        passengers.remove(name);
    }



    @Override
    public String toString() {
        return "Vehicle{" +
                "engine=" + engine +
                ", type='" + type + '\'' +
                ", isLand=" + isLand +
                ", isWater=" + isWater +
                ", isAir=" + isAir +
                ", isSpace=" + isSpace +
                ", passengers=" + passengers.size() +
                '}';
    }
}
