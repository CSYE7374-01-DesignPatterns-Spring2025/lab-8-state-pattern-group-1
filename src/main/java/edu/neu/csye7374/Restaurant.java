package edu.neu.csye7374;

public class Restaurant {
    private RestaurantState currentState;

    public Restaurant() {
        currentState = null;
    }

    public void setState(RestaurantState state) {
        this.currentState = state;
    }

    public void displayMenu() {
        if (currentState != null) {
            currentState.displayMenu();
        } else {
            System.out.println("No menu available. Please set a restaurant state first.");
        }
    }
}