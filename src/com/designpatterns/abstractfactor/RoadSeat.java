package com.designpatterns.abstractfactor;

public class RoadSeat implements BikeSeatInterface {
    @Override
    public String getSeatParts(){
        return "Seat parts for the Road Bike";
    }
}
