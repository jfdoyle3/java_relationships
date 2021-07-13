package com.caeerdevs;

public class Passenger {


    private String name;
    public int weight;

    public Passenger(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
