package org.admon.model;

/**
 * Interface representing an item in an order. This interface defines the essential methods
 * that any class representing an order item must implement. It provides a common
 * structure for different types of items within an order, such as drinks, sandwiches, or other products.
 */
public interface OrderItem {

    /**
     * Retrieves the name of the order item.
     * This method is intended to provide a human-readable name or description of the item.
     *
     * @return A string representing the name of the order item.
     */
    String getName();

    /**
     * Retrieves the price of the order item.
     * This method should implement the logic to calculate the price based on the specific attributes of the item.
     *
     * @return The price of the order item as a double value.
     */
    double getPrice();
}