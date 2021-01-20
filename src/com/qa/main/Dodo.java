package com.qa.main;

public class Dodo implements ExtinctCreature, EggLayingCreature {
    private String currentLocation;
    private int numberOfEggs;

    public Dodo(int initialEggs) {
        this.setNumberOfEggs(initialEggs);
    }

    public void layEggs() {
        this.setNumberOfEggs(getNumberOfEggs() + 1);
    }

    public void goExtinct() {
        this.setCurrentLocation("oh no i'm extinct");
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getNumberOfEggs() {
        return numberOfEggs;
    }

    public void setNumberOfEggs(int numberOfEggs) {
        this.numberOfEggs = numberOfEggs;
    }
}