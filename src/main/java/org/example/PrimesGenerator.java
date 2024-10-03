package org.example;

import java.util.Random;

public class PrimesGenerator {
    public int[] generateRandomArray(int size) {
        int[] res = new int[size];

        Random ran = new Random();

        for (int index = 0; index < size; index++) {
            res[index] = ran.nextInt(100);
        }

        return res;
    }
}
