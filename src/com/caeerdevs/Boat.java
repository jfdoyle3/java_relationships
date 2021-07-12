package com.caeerdevs;

import java.util.List;

public class Boat extends Vehicle{

    private int maxLoad;

    public Boat(Engine engine, String type, boolean isLand, boolean isWater, boolean isAir, boolean isSpace, List<Passenger> passengers, int maxLoad) {
        super(engine, type, isLand, isWater, isAir, isSpace, passengers);

        this.maxLoad=maxLoad;
    }


}
