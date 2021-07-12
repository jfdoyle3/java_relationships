package com.caeerdevs;

import java.util.List;

public class Plane extends Vehicle{

    public boolean isLanding;

    public Plane(Engine engine, String type, boolean isLand, boolean isWater, boolean isAir, boolean isSpace, List<Passenger> passengers, boolean isLanding) {
        super(engine, type, isLand, isWater, isAir, isSpace, passengers);

        this.isLanding=isLanding;
    }

    public boolean toggleLanding(){
        return true;
    }



}
