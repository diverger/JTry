package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
// https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
public class Main {

    static int find(int[] integers){

        int[] array = new int[3];

        System.out.println(Arrays.toString(integers));

        System.out.println(integers.length);

        for ( int i = 0; i < integers.length - 2; ++i )
        {
            array[0] = integers[i] % 2;
            array[1] = integers[i+1] % 2;
            array[2] = integers[i+2] % 2;

            int sum = Arrays.stream(array).sum();

            switch( sum )
            {
                case 2:
                    return integers[Arrays.asList(array).indexOf(0) + i];
                case 1:
                    System.out.println(Arrays.asList(array).indexOf(1));
                    return integers[Arrays.asList(array).indexOf(1) + i];
                case 3:
                case 0:
                    break;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
	// write your code here

        int n = find(new int[] {2,6,8,-10,3});

        System.out.println(n);
    }
}
