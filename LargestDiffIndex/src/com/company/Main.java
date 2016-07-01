package com.company;

public class Main {

    public static int largestDifference(int[] data) {

        //code here
        int diff = 0;
        for ( int i = 0; i < data.length; ++i)
        {
            for (int j = data.length - 1; j >= i; --j)
            {
                if ( data[j] >= data[i] )
                {
                    System.out.printf( "data[%d] - data[%d] = %d, %d\n", j, i, data[j] - data[i], j - i );
                    diff = (j - i) > diff ? (j - i) : diff;
                }
            }
        }

        return diff;
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println( largestDifference(new int[]{9,4,1,10,3,4,0,-1,-2}) );

    }
}
