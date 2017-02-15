package com.theironyard.novauc;

/**
 * Created by ANVIL_OCTOPUS on 2/15/17.
 */
public class Suzuki extends Motorcycles {

    public Suzuki() {
        this.bikeMaker = "Suzuki";
        this.wheels = "OffRoad";
        this.make = "DirtKiller";

    }




    @Override
    public void engines() {
        System.out.println("250cc");
    }


}
