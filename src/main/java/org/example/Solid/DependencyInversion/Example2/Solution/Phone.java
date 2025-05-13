package org.example.Solid.DependencyInversion.Example2.Solution;

/**
 * Phone class that implements the notification interface
 * Serves as an alert system to send you a message on your phone informing about the current weather conditions
 */
public class Phone implements Notification {
    /**
     * Generates an alert message formatted for your phone to state the condition of the weather
     * @param weatherCondition string representation of the current weather condition
     * @return the message as a string formatted for your phone
     */
    @Override
    public String generateWeatherAlert(String weatherCondition) {
        return "Phone Alert: It is " + weatherCondition;
    }
}
