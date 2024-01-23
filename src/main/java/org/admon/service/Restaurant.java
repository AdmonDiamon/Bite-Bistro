package org.admon.service;

import org.admon.model.OrderItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a restaurant. This class is responsible for managing the restaurant's name,
 * handling orders, calculating total income, and printing details of orders.
 */
public class Restaurant {
    private String name;
    private List<OrderItem> orders;

    /**
     * Constructs a Restaurant instance with a specified name.
     *
     * @param name The name of the restaurant.
     */
    public Restaurant(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    /**
     * Retrieves the name of the restaurant.
     *
     * @return The name of the restaurant.
     */
    public String getName() {
        return name;
    }

    /**
     * Adds an order to the restaurant's list of orders.
     *
     * @param item The order item to be added.
     */
    public void addOrder(OrderItem item) {
        orders.add(item);
    }

    /**
     * Calculates the total income generated from all orders.
     *
     * @return The total income as a double.
     */
    public double calculateIncome() {
        return orders.stream().mapToDouble(OrderItem::getPrice).sum();
    }

    /**
     * Prints details of all orders placed at the restaurant.
     * Each order item's name and price are displayed.
     */
    public void printOrders() {
        orders.forEach(item -> System.out.println(item.getName() + ": " + String.format("%,.2f", item.getPrice()) + " €"));
    }
}