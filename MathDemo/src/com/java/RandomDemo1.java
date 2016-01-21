package com.java;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random r = new Random(4);

        for (int i = 0; i < 10; ++i) {
            int num = r.nextInt(10) + 1;
            System.out.println(num);
        }

        Random r1 = new Random(4);

        for (int i = 0; i < 10; ++i) {
            int num = r1.nextInt(10) + 1;
            System.out.println(num);
        }
    }
}
