package org.example;

public abstract class Space {

    protected double size;

    public Space() {
        this.size = getType().getSpotSize();
    }

    public abstract SpaceType getType();


}
