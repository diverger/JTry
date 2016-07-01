package com.company;

/**
 * Created by Phoenix on 2016/7/1.
 */
public class SmallestIntegerFinder {
    publist static int findSmallestInt(int[] args)
    {
        int x = args[0];
        for ( int i: args )
        {
            if ( i < x )
            {
                x = i;
            }
        }

        return x;
    }
}
