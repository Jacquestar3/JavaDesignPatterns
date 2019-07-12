package com.designpatterns.observer2;

import java.util.ArrayList;
import java.util.List;

public class Speedometer {
    private int currentSpeed;
    private List<SpeedometerListener> listeners;

    public Speedometer(){
        currentSpeed = 0;
        listeners = new ArrayList<>();
    }
    public void setCurrentSpeed(int speed){
        this.currentSpeed = speed;
        fireSpeedChanged();
    }

    public int getCurrentSpeed() {return currentSpeed;}

    public void addSpeedometerListener(SpeedometerListener obj) {
        listeners.add(obj);
    }
        public void removeSpeedometerListener (SpeedometerListener obj){
            listeners.remove(obj);
        }

   
    private void fireSpeedChanged(){
        SpeedometerEvent speedEvent = new SpeedometerEvent(this, getCurrentSpeed());
        for(SpeedometerListener listen : listeners) {
            listen.speedChange(speedEvent);
        }
    }
}
