package com.meloire.personnage;

public class Personnage {

    private Orientation orientation = Orientation.NORD;

    public Orientation getOrientation() {
        return orientation;
    }

    public Orientation tourner(int fois) {
        Orientation[] orientations = Orientation.values();
        int nouvelIndex = this.orientation.ordinal() + fois;
        this.orientation = orientations[nouvelIndex];
        return this.orientation;
    }
}
