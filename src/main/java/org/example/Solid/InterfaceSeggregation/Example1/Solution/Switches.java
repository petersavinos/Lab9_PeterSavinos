package org.example.Solid.InterfaceSeggregation.Example1.Solution;

/**
 * Switches interface combines all the functionality of the methods for engine radio and camera.
 */
public interface Switches {

    void startEngine();
    void turnRadioOn();
    void turnRadioOff();
    void turnCameraOn();
    void turnCameraOff();
}
