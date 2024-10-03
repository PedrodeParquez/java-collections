package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanComparatorByLastNameTest {
    Human egor = new Human("Egor", "Mashin", 12);
    Human ivan = new Human("Ivan", "Mashin", 20);
    Human pedro = new Human("pedro", "parquez", 40);

    HumanComparatorByLastName comparator = new HumanComparatorByLastName();

    @Test
    void compare() {
        assertTrue(comparator.compare(egor, ivan) == 0);
        assertTrue(comparator.compare(egor, pedro) < 0);
        assertTrue(comparator.compare(pedro, egor) > 0);
    }
}