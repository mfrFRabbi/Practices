package com.company;

import java.util.Random;

public class DiceRoll {
    public DiceRoll() {
        Random random = new Random();
        int number = 0;
        roll(number,random);
    }
    void roll(int number,Random random){
        number = random.nextInt(6);
        System.out.println(number);


    }
}
