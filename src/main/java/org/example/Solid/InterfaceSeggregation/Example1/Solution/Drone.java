package org.example.Solid.InterfaceSeggregation.Example1.Solution;

public class Drone implements Switches {
    private boolean cameraOn;

    Drone() {} // constructor

    public void startEngine() {} // starts the drone

    public void turnRadioOn() {
    } // N/A

    public void turnRadioOff() {} // N/A

    public void turnCameraOn() {
        // turns on camera
        this.cameraOn = true;
    }

    public void turnCameraOff(){
        // turns camera off
        this.cameraOn = false;
    }


}
