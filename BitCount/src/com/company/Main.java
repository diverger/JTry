package com.company;

public class Main {

    public static int countBits(int n){
        // Show me the code!

        int r = 0;
        int bits = 0;

        while ( n >= 1 )
        {
            r = n % 10;
            for ( int i = 0; i < 4; ++i)
            {
                if (((r >>> i) & 0x1) == 0x1)
                {
                    ++bits;
                }
            }

            n /= 10;
        }

        return bits;

    }

    public static void main(String[] args) {
	// write your code here
    }
}
