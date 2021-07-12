package com.caeerdevs;

public class Tire {

    private int diameter;
    private int pressure;


    public Tire(int diameter, int pressure) {
        this.diameter = diameter;
        this.pressure = pressure;
    }

    public Boolean isFill(){
        return true;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "diameter=" + diameter +
                ", pressure=" + pressure +
                '}';
    }
}
