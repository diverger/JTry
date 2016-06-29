package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] primes = {2,3,5,7};

        for (int t: primes)
        {
            System.out.println(t);
        }

        int result = 0;

        for (int i = 0; i < 5; ++i)
        {
            if (i == 3)
            {
                result += 10;
            }
            else
            {
                result += i;
            }
        }

        System.out.println(result);
    }
}
