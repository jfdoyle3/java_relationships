package com.caeerdevs.vehicle;

import com.caeerdevs.Engine;

public class Plane extends Vehicle {

    public boolean isLanding;

    public Plane(Engine engine, boolean isLanding) {
        super(engine, "Plane", false, false, true, false);

        this.isLanding=isLanding;
    }

    public boolean toggleLanding(){
        return true;
    }



}
