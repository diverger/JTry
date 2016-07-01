package com.company;

/**
 * Created by Phoenix on 2016/7/1.
 */
public class Rotator {
    public Object[] rotate(Object[] data, int n)
    {
        Object[] d = new Object[data.length];

        for ( int i = 0; i < data.length; ++i)
        {
            int idx = (i + n) % data.length;

            idx = n < 0  ? idx + data.length : idx;

            d[idx] = data[i];
        }

        return d;
    }
}
