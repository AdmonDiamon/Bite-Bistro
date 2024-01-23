package org.admon.ui;

import org.admon.service.Restaurant;

/**
 * Provides static methods to display various elements of the user interface for a restaurant application.
 * This class is used for presenting visual elements and information in the console,
 * such as the application logo, welcome messages, and details of restaurant orders.
 */
public class UserInterface {

    /**
     * Prints the application logo to the console.
     * The logo is displayed as ASCII art representing the theme of the restaurant application.
     */
    public static void printLogo() {
        System.out.println("  ______  _  _          ______  _       _                ");
        System.out.println("  | ___ \\(_)| |         | ___ \\(_)     | |               ");
        System.out.println("  | |_/ / _ | |_   ___  | |_/ / _  ___ | |_  _ __   ___  ");
        System.out.println("  | ___ \\| || __| / _ \\ | ___ \\| |/ __|| __|| '__| / _ \\ ");
        System.out.println("  | |_/ /| || |_ |  __/ | |_/ /| |\\__ \\| |_ | |   | (_) |");
        System.out.println("  \\____/ |_| \\__| \\___| \\____/ |_||___/ \\__||_|    \\___/ ");
        System.out.println("                                                          ");
        System.out.println("                                                          ");
    }

    /**
     * Prints a welcome message to the console, including the name of the restaurant.
     *
     * @param restaurant The restaurant instance from which to retrieve the name.
     */
    public static void printWelcome(Restaurant restaurant) {
        System.out.println("Welcome to " + restaurant.getName() + " !");
    }

    /**
     * Prints details of orders placed at the specified restaurant.
     * This includes each order item's name and price, as well as the total income from orders.
     *
     * @param restaurant The restaurant instance from which to retrieve and print order details.
     */
    public static void printOrderDetails(Restaurant restaurant) {
        System.out.println("\nYour order:");
        restaurant.printOrders();
        System.out.println("\nTotal: " + String.format("%,.2f", restaurant.calculateIncome()) + " €");
    }
}