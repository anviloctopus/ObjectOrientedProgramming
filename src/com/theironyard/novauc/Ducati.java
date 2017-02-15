package com.theironyard.novauc;

/**
 * Created by ANVIL_OCTOPUS on 2/15/17.
 */
public class Ducati extends Motorcycles {

    public Ducati() {
        this.bikeMaker = "Ducati";
        this.wheels = "Road";
        this.make = "Monster";

    }



    @Override
    public void engines() {
        System.out.println("1100cc");
    }


}
