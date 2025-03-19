package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void demo() {
        Restaurant restaurant = new Restaurant();

        List<MenuItem> lunchMenuItems = new ArrayList<>();
        lunchMenuItems.add(new MenuItem(1, "Hot Dog", 1.99, "hot dog"));
        lunchMenuItems.add(new MenuItem(2, "Salad", 2.99, "salad"));
        lunchMenuItems.add(new MenuItem(3, "Hamburger", 3.99, "hamburger"));

        RestaurantState lunchState = new LunchState(lunchMenuItems);

        List<MenuItem> dinnerMenuItems = new ArrayList<>();
        dinnerMenuItems.add(new MenuItem(1, "Soup", 11.99, "soup"));
        dinnerMenuItems.add(new MenuItem(2, "Salad", 12.99, "salad"));
        dinnerMenuItems.add(new MenuItem(3, "Steak", 13.99, "steak"));
        dinnerMenuItems.add(new MenuItem(4, "Salmon", 14.99, "salmon"));
        dinnerMenuItems.add(new MenuItem(5, "Chicken", 15.99, "chicken"));

        RestaurantState dinnerState = new DinnerState(dinnerMenuItems);

        List<MenuItem> barMenuItems = new ArrayList<>();
        barMenuItems.add(new MenuItem(1, "Beer ", 5.99, "beer"));
        barMenuItems.add(new MenuItem(2, "Cocktail", 8.99, "cocktail"));
        barMenuItems.add(new MenuItem(3, "Wine", 7.99, "wine"));
        barMenuItems.add(new MenuItem(4, "Appetizer Platter", 9.99, "appetizer platter"));

        RestaurantState barState = new BarState(barMenuItems);

        restaurant.setState(lunchState);
        restaurant.displayMenu();

        restaurant.setState(dinnerState);
        restaurant.displayMenu();

        restaurant.setState(barState);
        restaurant.displayMenu();
    }
}
