package com.theironyard.novauc;

/**
 * Created by ANVIL_OCTOPUS on 2/15/17.
 */
public class Harley extends Motorcycles {

    public Harley() {
        this.bikeMaker = "Harley";
        this.wheels = "Road";
        this.make = "FatBoy";
    }





    @Override
    public void engines() {
        System.out.println("750cc");
    }

}
