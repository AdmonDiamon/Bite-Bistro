package org.admon.enums;

/**
 * Enum representing different sandwich ingredients, each associated with a specific price.
 * This enumeration provides a structured way to manage various ingredients
 * and their respective prices in a sandwich-making context.
 */
public enum Ingredient {
    SALAD(0.50),
    CHEESE(1.00),
    TOMATO(0.30),
    SPECIAL (5.00);

    private final double price;

    /**
     * Constructor for the Ingredient enumeration.
     * Initializes an ingredient with a specified price.
     *
     * @param price The price of the ingredient.
     */
    Ingredient(double price) {
        this.price = price;
    }

    /**
     * Retrieves the price of the ingredient.
     *
     * @return The price of the ingredient.
     */
    public double getPrice() {
        return this.price;
    }
}