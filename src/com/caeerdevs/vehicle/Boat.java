package com.caeerdevs.vehicle;

import com.caeerdevs.Engine;
import com.caeerdevs.Passenger;

import java.util.List;

public class Boat extends Vehicle {

    private int maxLoad;

    public Boat(Engine engine, String type, boolean isLand, boolean isWater, boolean isAir, boolean isSpace, List<Passenger> passengers, int maxLoad) {
        super(engine, "Boat", false, true, false, false);

        setMaxLoad(maxLoad);
    }

    private void setMaxLoad(int maxLoad) {

//        if ( > maxLoad)
//            return;
//        else
//            this.maxLoad = maxLoad;
    }
}
