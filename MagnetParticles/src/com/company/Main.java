package com.company;

import static java.lang.Math.pow;

public class Main {

    public static double doubles(int maxk, int maxn) {
        // your code

        double sigma = 0;

        for (int k = 1; k <= maxk; ++k)
        {
            for ( int n = 1; n <= maxn; ++n)
            {
                double v_k = 1 / (k * pow(n+1, 2*k));
                sigma += v_k;
            }
        }

        return sigma;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
