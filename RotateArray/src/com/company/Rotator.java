package com.company;
// http://stackoverflow.com/questions/5385024/mod-in-java-produces-negative-numbers

import static java.lang.Math.floorMod;

/**
 * Created by Phoenix on 2016/7/1.
 */
public class Rotator {
    public Object[] rotate(Object[] data, int n)
    {
        Object[] d = new Object[data.length];

        for ( int i = 0; i < data.length; ++i)
        {
            int idx = floorMod(i + n, data.length);
            d[idx] = data[i];
        }

        return d;
    }
}
