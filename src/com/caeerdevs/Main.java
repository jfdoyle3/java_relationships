package com.caeerdevs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Engine carEngine = new Engine("V8", false, 100);
        Tire carTire = new Tire(27, 25);
        Passenger passenger=new Passenger("Sam", 118);
        List<Tire> carTires = new ArrayList<>();
        List<Passenger> passengers=new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            carTires.add(new Tire(27, 25));
            passengers.add(new Passenger("Sam", 118));
        }

        Vehicle car = new Car(carEngine, "Car", true,
                false, false, false,
                passengers,carTires);

        System.out.println(car.turnOff());


    }
}
