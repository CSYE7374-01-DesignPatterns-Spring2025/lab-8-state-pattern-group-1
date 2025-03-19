package edu.neu.csye7374;

import java.util.List;

public class BarState implements RestaurantState {
    private List<MenuItem> menuItems;

    public BarState(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public void displayMenu() {
        System.out.println("===== BAR MENU =====");
        System.out.println("ITEM    PRICE       DESCRIPTION");
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
        System.out.println("====================");
    }
}
