package edu.neu.csye7374;

public class MenuItem {
    private int id;
    private String name;
    private double price;
    private String description;

    public MenuItem(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("%-5d $%-10.2f %s", id, price, description);
    }
}

