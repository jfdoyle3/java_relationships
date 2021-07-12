package com.caeerdevs;

public class Engine {

    private String type;
    private boolean isOn;
    private int fuel;

    public Engine(String type, boolean isOn, int fuel) {
        this.type = type;
        this.isOn = isOn;
        this.fuel = fuel;
    }

    public boolean isOn() {
        return true;
    }

    public boolean isOff(){
        return false;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", isOn=" + isOn +
                ", fuel=" + fuel +
                '}';
    }
}
