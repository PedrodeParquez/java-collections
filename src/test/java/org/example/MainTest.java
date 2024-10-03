package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void invertMap() {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("One", 1);
        originalMap.put("Two", 2);
        originalMap.put("Three", 3);

        Map<Integer, String> expectedInvertedMap = new HashMap<>();
        expectedInvertedMap.put(1, "One");
        expectedInvertedMap.put(2, "Two");
        expectedInvertedMap.put(3, "Three");

        assertEquals(expectedInvertedMap, Main.invertMap(originalMap));
    }

    Map<String, Integer> expectedMap = new HashMap<>();

    @Test
    void countWordInString() {
        String str = "If the type of an expression is a reference type,"
                + " then the class of the referenced object, or even whether"
                + " the value is a reference to an object rather than null,"
                + " is not necessarily known at compile time. There are a"
                + " few places in the Java programming language where the "
                + "actual class of a referenced object affects program "
                + "execution in a manner that cannot be deduced from the "
                + "type of the expression.";

        fillMap();

        assertEquals(expectedMap, Main.countWordInString(str));
    }

    void fillMap() {
        expectedMap.put("be", 1);
        expectedMap.put("rather", 1);
        expectedMap.put("language", 1);
        expectedMap.put("program", 1);
        expectedMap.put("manner", 1);
        expectedMap.put("type", 3);
        expectedMap.put("necessarily", 1);
        expectedMap.put("reference", 2);
        expectedMap.put("that", 1);
        expectedMap.put("not", 1);
        expectedMap.put("java", 1);
        expectedMap.put("known", 1);
        expectedMap.put("compile", 1);
        expectedMap.put("are", 1);
        expectedMap.put("whether", 1);
        expectedMap.put("of", 4);
        expectedMap.put("than", 1);
        expectedMap.put("few", 1);
        expectedMap.put("where", 1);
        expectedMap.put("from", 1);
        expectedMap.put("if", 1);
        expectedMap.put("class", 2);
        expectedMap.put("value", 1);
        expectedMap.put("programming", 1);
        expectedMap.put("a", 5);
        expectedMap.put("actual", 1);
        expectedMap.put("execution", 1);
        expectedMap.put("expression", 2);
        expectedMap.put("or", 1);
        expectedMap.put("in", 2);
        expectedMap.put("affects", 1);
        expectedMap.put("is", 3);
        expectedMap.put("then", 1);
        expectedMap.put("an", 2);
        expectedMap.put("the", 8);
        expectedMap.put("deduced", 1);
        expectedMap.put("places", 1);
        expectedMap.put("at", 1);
        expectedMap.put("null", 1);
        expectedMap.put("referenced", 2);
        expectedMap.put("even", 1);
        expectedMap.put("there", 1);
        expectedMap.put("cannot", 1);
        expectedMap.put("to", 1);
        expectedMap.put("time", 1);
        expectedMap.put("object", 3);
    }
}