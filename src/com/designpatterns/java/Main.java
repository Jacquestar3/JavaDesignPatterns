package com.designpatterns.java;

import com.designpattern.decorator.CustomGripOption;
import com.designpattern.decorator.GoldFrameOption;
import com.designpatterns.abstractfactor.AbstractBikeFactory;
import com.designpatterns.abstractfactor.BikeFrameInterface;
import com.designpatterns.abstractfactor.BikeSeatInterface;
import com.designpatterns.abstractfactor.RoadBikeFactory;
import com.designpatterns.adaptor.UltraWheel;
import com.designpatterns.adaptor.UltraWheelAdapter;
import com.designpatterns.base.*;
import com.designpatterns.behavioral.MountainBikeRange;
import com.designpatterns.behavioral.RoadBikeRange;
import com.designpatterns.facade.BikeFacade;
import com.designpatterns.observer.Gearbox;
import com.designpatterns.observer.SpeedMonitor;
import com.designpatterns.observer.Speedometer;
import com.designpatterns.singleton.SerialNumberGenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            observerExample2();
         //observerExample1();
        //iteratorExample2();
        //iteratorExample1();
        // abstractFactoryExample();
        //singletonExample();
        //facadeExample();
        // decoratorExample();
        // adapterExample();
    }



private static void observerExample2(){
       com.designpatterns.observer2.Speedometer speed
                = new com.designpatterns.observer2.Speedometer();
        speed.addSpeedometerListener(new com.designpatterns.observer2.SpeedMonitor());
        speed.addSpeedometerListener(new com.designpatterns.observer2.Gearbox() );

    speed.setCurrentSpeed(5);
    speed.setCurrentSpeed(10);
    speed.setCurrentSpeed(20);
    speed.setCurrentSpeed(30);
    speed.setCurrentSpeed(35);



}




    private static void observerExample1(){
        SpeedMonitor monitor = new SpeedMonitor();
        Speedometer speed = new Speedometer();
        speed.addObserver(monitor);
        speed.addObserver(new Gearbox());

        speed.setCurrentSpeed(5);
        speed.setCurrentSpeed(10);
        speed.setCurrentSpeed(15);
        speed.setCurrentSpeed(20);
        speed.setCurrentSpeed(26);
        speed.setCurrentSpeed(33);

    }

    private static void iteratorExample2(){
        System.out.println("=== Our Mountain Bikes ===");
        MountainBikeRange bikeRange = new MountainBikeRange();

        for(BikeInterface bike : bikeRange.getRange()){
            System.out.println(bike);
        }
    }



    private static void iteratorExample1(){
        System.out.println("=== Our Road Bikes ===");
        RoadBikeRange bikeRange = new RoadBikeRange();
        printIterator(bikeRange.iterator());


    }


   private static void printIterator(Iterator iter){
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
   }




  private static void abstractFactoryExample(){
      AbstractBikeFactory factory = new RoadBikeFactory();
      BikeFrameInterface frame = factory.createFrame();
      BikeSeatInterface seat = factory.createSeat();

      System.out.println(frame.getFrameParts());
      System.out.println(seat.getSeatParts());


  }





   private static void singletonExample(){
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        System.out.println("next serial = " + generator.getNextSerial());
        System.out.println("next serial = " + generator.getNextSerial());
        System.out.println("next serial = " + generator.getNextSerial());
        System.out.println("next serial = " + generator.getNextSerial());
   }



    private static void facadeExample(){
        BikeFacade facade = new BikeFacade();
        facade.prepareForSale(new DownHill(new WideWheel(24)));

    }



  private static void decoratorExample() {
      BikeInterface myTourBike = new Touring(new NarrowWheel(24));
      System.out.println(myTourBike);

      myTourBike = new CustomGripOption(myTourBike);
      System.out.println(myTourBike);

      myTourBike = new GoldFrameOption(myTourBike);
      System.out.println(myTourBike);
  }



    private static void adapterExample() {
        UltraWheel UltraWheel = new UltraWheel(28);
        List<WheelInterface> wheels = new ArrayList<>();
        wheels.add(new NarrowWheel(24));
        wheels.add(new NarrowWheel(20));
        wheels.add(new WideWheel(24));
        wheels.add(new UltraWheelAdapter(UltraWheel));
        wheels.add(new UltraWheelAdapter(new UltraWheel(26)));
        for (WheelInterface wheel : wheels) {
            System.out.println(wheel);
        }
    }
}