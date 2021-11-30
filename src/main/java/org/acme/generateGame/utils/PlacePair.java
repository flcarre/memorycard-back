package org.acme.generateGame.utils;

import java.util.Random;

public class PlacePair {

    public int generateRandomNumber(int max) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(max);
        return randomNumber;
    }

}
