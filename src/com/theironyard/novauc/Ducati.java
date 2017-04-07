package com.theironyard.novauc;

/**
 * Created by ANVIL_OCTOPUS on 2/15/17.
 */
public class Ducati extends Motorcycles {

    // implicit constructor
    // assigns the value of the instance variable upon creation/initialization
    public Ducati() {
        this.bikeMaker = "Ducati";
        this.wheels = "Road";
        this.make = "Monster";

    }

    // explicit constructor
    public Ducati(String intialBikeMaker, String intialWheels, String intialMake) {
        this.bikeMaker = intialBikeMaker;
        this.wheels = intialWheels;
        this.make = intialMake;
    }




    @Override
    public void engines() {
        System.out.println("1100cc");
    }


}
