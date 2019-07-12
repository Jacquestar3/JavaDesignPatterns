package com.designpatterns.adaptor;

public class UltraWheel {
    private int size;

    public UltraWheel(int size){
        this.size = size;
    }// enc constructor

    public int getWheelSize(){
        return size;
    }

  @Override
  public String toString(){
        return "Ultra Wheel"+  "("+size+") inches";
  }





}

