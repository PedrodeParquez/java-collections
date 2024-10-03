package org.example;

import org.junit.jupiter.api.Test;
import org.junit.runner.notification.RunListener;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human person = new Human("Ivan", "Mashin", 18);

    @Test
    void getFirstName() {
        assertEquals("Ivan", person.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Mashin", person.getLastName());
    }

    @Test
    void getAge() {
        assertEquals(18, person.getAge());
    }

    @Test
    void compareTo() {
        Human egor = new Human("Egor", "Mashin", 20);
        Human jack = new Human("Jack", "Shepard", 35);

        assertEquals(0, person.compareTo(person));

        assertEquals(-1, person.compareTo(jack));

        assertEquals(4, person.compareTo(egor));
    }

    @Test
    void toStringTest() {
        assertEquals("Human{firstName='Ivan', lastName='Mashin', age=18}", person.toString());
    }
}