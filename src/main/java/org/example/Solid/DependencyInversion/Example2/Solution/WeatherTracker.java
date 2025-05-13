package org.example.Solid.DependencyInversion.Example2.Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * WeatherTracker class is a class that is responsible for tracking the conditions of the weather
 * Notifies the user via different services
 */
public class WeatherTracker {
    private final List<Notification> services = new ArrayList<>(); // list of notification services
    private String currentCond; // keeps track of the current weather condition

    /**
     * method to add new services that can be notified
     * @param service implements the notification interface
     */
    public void addNotification(Notification service) {
        services.add(service);
    }

    /**
     * method to set the new current conditions of the weather as the weather changes
     * @param weatherDescription description of the current conditions of the weather
     */
    public void setCurrentCond(String weatherDescription) {
        this.currentCond = weatherDescription;
        for (Notification service : services) { // notifies each service
            String Alert = service.generateWeatherAlert(weatherDescription);
            System.out.println(Alert);
        }
    }
}
