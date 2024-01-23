package org.admon.enums;

/**
 * Enum representing different flavors of drinks, each associated with a specific price.
 * This enumeration provides a structured way to handle various drink flavors
 * along with their respective prices in a beverage management context.
 */
public enum DrinkFlavour {
    COCA_COLA(1.50),
    FANTA(1.20),
    ICE_TEA(1.75);

    private final double price;

    /**
     * Constructor for the DrinkFlavour enumeration.
     * Initializes a drink flavor with a specified price.
     *
     * @param price The price of the drink flavor.
     */
    DrinkFlavour(double price) {
        this.price = price;
    }

    /**
     * Retrieves the price of the drink flavor.
     *
     * @return The price of the drink flavor.
     */
    public double getPrice() {
        return this.price;
    }
}