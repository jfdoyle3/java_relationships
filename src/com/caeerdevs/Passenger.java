package com.caeerdevs;

import java.util.List;

public class Passenger {


    private String name;
    private int weight;

    public Passenger(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getTotalPassengerWeight(List<Passenger> passengers){
        int totalWeight=0;
        for(Passenger passenger : passengers)
            totalWeight+=passenger.getWeight();
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
