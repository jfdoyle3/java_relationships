package com.caeerdevs.vehicle;

import com.caeerdevs.Engine;
import com.caeerdevs.Tire;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {

    private List<Tire> tires;

    public Car(Engine engine, List<Tire> tires) {
        super(engine,"Car", true,false,false,false);

        this.tires=new ArrayList<>();
    }


    @Override
    public String toString() {
        return "Car{ " +
                "\nengine: " + engine +
                "\ntires: " + tires +
                "\n Passengers: "+passengers+
                '}';
    }
}
