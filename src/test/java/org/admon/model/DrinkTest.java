package org.admon.model;

import org.admon.enums.DrinkFlavour;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    @ParameterizedTest
    @EnumSource(DrinkFlavour.class)
    void testGetPrice(DrinkFlavour flavour) {
        Drink drink = new Drink(flavour);

        assertEquals(flavour.getPrice(), drink.getPrice());
    }

    @ParameterizedTest
    @EnumSource(DrinkFlavour.class)
    void testGetName(DrinkFlavour flavour) {
        Drink drink = new Drink(flavour);

        assertEquals(flavour.name().replace("_", " "), drink.getName());
    }
}