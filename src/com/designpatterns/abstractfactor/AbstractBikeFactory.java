package com.designpatterns.abstractfactor;

public abstract class AbstractBikeFactory {
    public abstract BikeFrameInterface createFrame();
    public abstract BikeSeatInterface createSeat();

}
