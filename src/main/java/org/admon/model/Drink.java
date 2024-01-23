package org.admon.model;

import org.admon.enums.DrinkFlavour;

/**
 * Represents a drink as an order item. This class implements the OrderItem interface
 * and is responsible for managing a drink's flavor and price.
 */
public class Drink implements OrderItem {
    private DrinkFlavour flavour;

    /**
     * Constructs a Drink instance with a specified flavor.
     * The flavor is determined based on the DrinkFlavour enumeration.
     *
     * @param flavour The flavor of the drink, as defined in the DrinkFlavour enum.
     */
    public Drink(DrinkFlavour flavour) {
        this.flavour = flavour;
    }

    /**
     * Retrieves the price of the drink based on its flavor.
     * The price is derived from the associated value in the DrinkFlavour enum.
     *
     * @return The price of the drink.
     */
    @Override
    public double getPrice() {
        return flavour.getPrice();
    }

    /**
     * Retrieves the name of the drink flavor.
     * The method replaces underscores in the enum constant with spaces for better readability.
     *
     * @return The name of the drink flavor, formatted for display.
     */
    @Override
    public String getName() {
        return flavour.name().replace("_", " "); // replacing underscores with spaces
    }
}