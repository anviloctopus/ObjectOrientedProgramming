package com.theironyard.novauc;

/**
 * Created by ANVIL_OCTOPUS on 2/15/17.
 */
public class Yamaha extends Motorcycles {


    public Yamaha() {
        this.bikeMaker = "Yamaha";
        this.wheels = "Road";
        this.make = "Stryker";
    }



    @Override
    public void engines() {
        System.out.println("1200cc");
    }

}
