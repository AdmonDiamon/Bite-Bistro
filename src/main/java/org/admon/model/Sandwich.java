package org.admon.model;

import org.admon.enums.Ingredient;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a sandwich as an order item. This class implements the OrderItem interface
 * and manages a sandwich's ingredients and name. It allows for the addition of ingredients and
 * calculates the total price based on these ingredients.
 */
public class Sandwich implements OrderItem {
    private List<Ingredient> ingredients;
    private String name;

    /**
     * Constructs a Sandwich instance with a specified name.
     *
     * @param name The name of the sandwich.
     */
    public Sandwich(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    /**
     * Constructs a Sandwich instance with a default name.
     * This constructor utilizes constructor chaining for initialization.
     */
    public Sandwich() {
        this("Custom Sandwich");
    }

    /**
     * Adds an ingredient to the sandwich.
     *
     * @param ingredient The ingredient to be added to the sandwich.
     */
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    /**
     * Calculates the total price of the sandwich based on the prices of its ingredients.
     *
     * @return The total price of the sandwich.
     */
    @Override
    public double getPrice() {
        double total = 0;

        for (Ingredient ingredient : ingredients) {
            total += ingredient.getPrice();
        }
        return total;
    }

    /**
     * Retrieves the name of the sandwich.
     * Returns a default name if the custom name is not set.
     *
     * @return The name of the sandwich.
     */
    @Override
    public String getName() {
        return name != null ? name : "Custom Sandwich";
    }
}