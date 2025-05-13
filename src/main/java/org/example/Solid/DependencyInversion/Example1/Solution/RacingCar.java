package org.example.Solid.DependencyInversion.Example1.Solution;

/**
 * RacingCar class is an implementation of the Car interface and it overrides a public method accelerate
 * the method increases the power and descreases the remainingfuel emulating the acceleration of a car.
 */
public class RacingCar implements Car {
    private int remainingFuel; // amount of fuel remaining in the car
    private int power; // level of power being used by the car

    /**
     * Construct that initializes the remaining fuel and power of the car
     * power is set to 0 to start
     * @param remainingFuel the amount of fuel the car starts with
     */
    public RacingCar(final int remainingFuel) {
        this.remainingFuel = remainingFuel;
        this.power = 0;
    }

    /**
     * Method to accelerate the car by increasing the power level of the car and descreaing the remaining fuel of the car at the same time.
     */
    @Override
    public void accelerate() {
        power++;
        remainingFuel--;
        System.out.println("Accelerate Power is " + power + " and there is " + remainingFuel + " fuel remainging.");
    }
}
