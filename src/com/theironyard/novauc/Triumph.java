package com.theironyard.novauc;

/**
 * Created by ANVIL_OCTOPUS on 2/15/17.
 */
public class Triumph extends Motorcycles {


    public Triumph() {
        this.bikeMaker = "Triumph";
        this.wheels = "Road";
        this.make = "CitySlicker";

    }



    @Override
    public void engines() {
        System.out.println("650cc");
    }


}
