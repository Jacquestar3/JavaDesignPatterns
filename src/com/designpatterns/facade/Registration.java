package com.designpatterns.facade;

import com.designpatterns.base.BikeInterface;

public class Registration {
    private BikeInterface bike;

    Registration(BikeInterface bike){
        this.bike = bike;
    }


   public void allocatingBikeNumber() {
        System.out.println("Allocating Bike Number");
   }



}
