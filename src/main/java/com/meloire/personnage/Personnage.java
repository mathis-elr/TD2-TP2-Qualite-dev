package com.meloire.personnage;

public class Personnage {

    private Orientation orientation = Orientation.NORD;

    public Orientation getOrientation() {
        return orientation;
    }

    public Orientation tourner(int fois) {
        this.orientation = Orientation.EST;
        return this.orientation;
    }
}
