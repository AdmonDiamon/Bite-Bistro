package org.admon;

import org.admon.enums.DrinkFlavour;
import org.admon.model.Drink;
import org.admon.enums.Ingredient;
import org.admon.model.Sandwich;
import org.admon.service.Restaurant;
import org.admon.ui.UserInterface;

import java.util.Arrays;
import java.util.List;

/**
 * The main class of the restaurant application.
 * This class is responsible for creating a restaurant instance, preparing orders of drinks and sandwiches,
 * and managing the overall flow of the application.
 */
public class Main {
    public static void main(String[] args) {
        Restaurant bistroBites = new Restaurant("Bite Bistro");

        List<Drink> drinks = createDrinks();
        List<Sandwich> sandwiches = createSandwiches();

        orderDrinks(bistroBites, drinks);
        orderSandwiches(bistroBites, sandwiches);

        printOrderDetails(bistroBites);
    }

    /**
     * Creates a list of drinks with various flavors.
     *
     * @return A list of Drink instances.
     */
    private static List<Drink> createDrinks() {
        return Arrays.asList(
                new Drink(DrinkFlavour.COCA_COLA),
                new Drink(DrinkFlavour.FANTA),
                new Drink(DrinkFlavour.ICE_TEA)
        );
    }

    /**
     * Creates a list of sandwiches with different ingredients.
     *
     * @return A list of Sandwich instances.
     */
    private static List<Sandwich> createSandwiches() {
        Sandwich sandwich = new Sandwich();
        sandwich.addIngredient(Ingredient.CHEESE);
        sandwich.addIngredient(Ingredient.SALAD);

        Sandwich sandwichSpecial = new Sandwich("Special Sandwich");
        sandwichSpecial.addIngredient(Ingredient.CHEESE);
        sandwichSpecial.addIngredient(Ingredient.SALAD);
        sandwichSpecial.addIngredient(Ingredient.SPECIAL);

        return Arrays.asList(sandwich, sandwichSpecial);
    }

    /**
     * Places orders for a list of drinks at the given restaurant.
     *
     * @param restaurant The restaurant to which the drink orders are to be added.
     * @param drinks The list of drinks to be ordered.
     */
    private static void orderDrinks(final Restaurant restaurant, List<Drink> drinks) {
        for (Drink drink : drinks) {
            restaurant.addOrder(drink);
        }
    }

    /**
     * Places orders for a list of sandwiches at the given restaurant.
     *
     * @param restaurant The restaurant to which the sandwich orders are to be added.
     * @param sandwiches The list of sandwiches to be ordered.
     */
    private static void orderSandwiches(final Restaurant restaurant, List<Sandwich> sandwiches) {
        for (Sandwich sandwich : sandwiches) {
            restaurant.addOrder(sandwich);
        }
    }

    /**
     * Prints the details of orders placed at the restaurant.
     *
     * @param restaurant The restaurant from which the order details are to be printed.
     */
    private static void printOrderDetails(final Restaurant restaurant) {
        UserInterface.printLogo();
        UserInterface.printWelcome(restaurant);
        UserInterface.printOrderDetails(restaurant);
    }
}