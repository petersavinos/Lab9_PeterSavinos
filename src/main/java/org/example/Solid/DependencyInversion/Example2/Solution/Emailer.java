package org.example.Solid.DependencyInversion.Example2.Solution;

/**
 * Emailer is a class that implments the Notification interface
 * It serves as an email alert system that sends you the conditions of the weather.
 */
public class Emailer implements Notification {
    /**
     * method that returns the conditions of the weather as a string.
     * @param weatherCondition a string representation of the current weather condition
     * @return a message as a string
     */
    @Override
    public String generateWeatherAlert(String weatherCondition) {
        return "Email Alert: It is " + weatherCondition;
    }
}

