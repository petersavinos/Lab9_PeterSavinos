package org.example.Solid.InterfaceSeggregation.Example1.Solution;

/**
 * Car class that implements the Switches interface
 */
public class Car implements Switches  {
    private boolean radioOn;

    Car() {} // constructor
    public void startEngine() {} // method to start the engine

    public void turnRadioOn() {this.radioOn = true;} //method to turn the radio on

    public void turnRadioOff() {this.radioOn = false;} // method to turn the radio off

    public void turnCameraOn() {} // method to turn the camera on

    public void turnCameraOff() {} // method to turn the camera off
}
