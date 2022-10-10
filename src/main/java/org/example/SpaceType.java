package org.example;

public enum SpaceType {

    compact(0.5), regular(1);

    final double spotSize;

//    SpaceType() {
//    }

    SpaceType(double spotSize) {
        this.spotSize = spotSize;
    }

    public double getSpotSize() {
        return spotSize;
    }

}
