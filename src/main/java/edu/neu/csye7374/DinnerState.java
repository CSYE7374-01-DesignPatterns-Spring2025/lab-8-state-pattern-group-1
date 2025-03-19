package edu.neu.csye7374;

import java.util.List;

public class DinnerState implements RestaurantState {
    private List<MenuItem> menuItems;

    public DinnerState(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public void displayMenu() {
        System.out.println("===== DINNER MENU =====");
        System.out.println("ITEM    PRICE       DESCRIPTION");
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
        System.out.println("=======================");
    }
}
