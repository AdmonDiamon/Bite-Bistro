package org.admon.model;

import org.admon.enums.Ingredient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SandwichTest {

    @Test
    void testGetPriceWithNoIngredients() {
        Sandwich sandwich = new Sandwich();

        assertEquals(0.0, sandwich.getPrice());
    }

    @Test
    void testGetPriceWithIngredients() {
        Sandwich sandwich = new Sandwich();

        sandwich.addIngredient(Ingredient.CHEESE);
        sandwich.addIngredient(Ingredient.SALAD);

        double expectedPrice = Ingredient.CHEESE.getPrice() + Ingredient.SALAD.getPrice();

        assertEquals(expectedPrice, sandwich.getPrice());
    }
}