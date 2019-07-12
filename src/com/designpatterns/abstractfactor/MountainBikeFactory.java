package com.designpatterns.abstractfactor;

public class MountainBikeFactory extends AbstractBikeFactory {
    @Override
    public BikeFrameInterface createFrame(){
        return new MountainFrame();
    }

    @Override
    public BikeSeatInterface createSeat(){
        return new MountainSeat();
    }


}
