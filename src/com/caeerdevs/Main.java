package com.caeerdevs;

import com.caeerdevs.vehicle.Car;
import com.caeerdevs.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Engine gasEngine = new Engine("V8", false, 100);
        Engine electricEngine= new Engine("Electric",false, 0);

        Tire carTire = new Tire(27, 25);
        Tire planeTire=new Tire(50, 50);
        Passenger passenger=new Passenger("Sam", 118);

        List<Tire> carTires = new ArrayList<>();
        List<Passenger> passengers=new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            carTires.add(new Tire(27, 25));
            passengers.add(new Passenger("Sam", 118));
        }

        Vehicle car = new Car(gasEngine,carTires);

        System.out.println(car);


    }
}
