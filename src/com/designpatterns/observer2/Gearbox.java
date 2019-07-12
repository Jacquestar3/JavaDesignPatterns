package com.designpatterns.observer2;

public class Gearbox implements SpeedometerListener{
    @Override
    public void speedChange(SpeedometerEvent speedo){
        if (speedo.getSpeed() <= 5) {
            System.out.println("Now in easy gear");
        } else if (speedo.getSpeed() <= 10) {
            System.out.println("Now in the 2nd gear");

        } else if (speedo.getSpeed() <= 20) {
            System.out.println("Now in 3rd gear ");
        } else if (speedo.getSpeed() <=25) {
            System.out.println("Now in 4th gear");
        } else if (speedo.getSpeed()<=30){
            System.out.println("Now in 5th gear");
        }

    }
}
