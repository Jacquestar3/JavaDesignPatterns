package com.designpatterns.abstractfactor;

public class MountainFrame implements BikeFrameInterface {
    @Override
    public String getFrameParts(){
        return "Frame parts for the Mountain Bike";
    }
}
