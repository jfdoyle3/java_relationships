package com.caeerdevs;

import java.util.List;

public class Car extends Vehicle{

    private List<Tire> tires;
    private final String type="Car";
    private final boolean isLand=true;
    private final boolean isWater=false;
    private final boolean isSpace=false;
    private final boolean isAir=false;



    public Car(Engine engine, String type, boolean isLand, boolean isWater, boolean isAir,
               boolean isSpace, List<Passenger> passengers, List<Tire> tires) {
        super(engine, type, isLand, isWater, isAir, isSpace, passengers);

        this.tires=tires;
    }


    @Override
    public String toString() {
        return "Car{" +
                "tires=" + tires +
                ", type='" + type + '\'' +
                ", isLand=" + isLand +
                ", isWater=" + isWater +
                ", isSpace=" + isSpace +
                ", isAir=" + isAir +
                '}';
    }
}
