package com.company;

import java.util.Arrays;

// https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java

/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers.
The integers in the array are either entirely odd or entirely even except for a single integer N. Write a method
that takes the array as an argument and returns N.

For example:

[2, 4, 0, 100, 4, 11, 2602, 36]

Should return: 11

[160, 3, 1719, 19, 11, 13, -21]

Should return: 160
 */

public class Main {

    static int find(int[] integers){

        Integer[] array = new Integer[3];

        for ( int i = 0; i < integers.length - 2; ++i )
        {
            array[0] = Math.abs(integers[i+0] % 2);
            array[1] = Math.abs(integers[i+1] % 2);
            array[2] = Math.abs(integers[i+2] % 2);

            System.out.println(Arrays.toString(array));

            int sum = array[0] + array[1] + array[2];

            switch( sum )
            {
                case 2:
                    return integers[Arrays.asList(array).indexOf(0) + i];
                case 1:
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

        int n = find(new int[] {-3,-2,-5});

        System.out.println(n);
    }
}
