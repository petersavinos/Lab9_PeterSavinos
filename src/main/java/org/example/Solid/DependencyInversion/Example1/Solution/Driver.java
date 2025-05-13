package org.example.Solid.DependencyInversion.Example1.Solution;

/**
 * Driver class which acts as a model to control a car.
 * This construct allows for abstraction which makes it applicable for multiple types of cars instead of just a racing car.
 */
public class Driver {
    private final Car car; // Abstract type

    /**
     * Construct to initialize the Driver for the car
     * @param car object for the Car interface implementation
     */
    public Driver(Car car) {
        this.car = car;
    }

    /**
     * method that increases the speed of the car to make it accelerate
     */
    public void increaseSpeed() {
        car.accelerate();
    }

}
