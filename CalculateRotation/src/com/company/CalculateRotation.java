package com.company;
import  java.util.Queue;

/**
 * Created by Phoenix on 2016/7/1.
 */
public class CalculateRotation {
    static int shiftedDiff(String first, String second)
    {
        if (first.length() != second.length())
        {
            return -1;
        }

        int n = -1;

        for ( int i = 0; i < first.length(); ++i)
        {
            String t = first.substring(first.length() - i, first.length()) + first.substring(0, first.length() - i);

            System.out.println(t);

            // Note: '==' tests for reference equality (whether they are the same object).
            // .equals() tests for value equality (whether they are logically "equal").
            if ( t.equals(second) )
            {
                System.out.println("OK");
                n = i;
                break;
            }
        }

        return n;
    }
}
