package com.company;

/**
 * Created by Phoenix on 2016/6/29.
 */

public class Line {

    public static String Tickets(int[] peopleInLine)
    {
        int m25 = 0;
        int m50 = 0;
        int m100 = 0;

        int ticket_value = 25;

        for (int i = 0; i < peopleInLine.length; ++i)
        {
            int money = peopleInLine[i];
            int change = money - ticket_value;

            int a = change / 100;

            if (a > m100)
            {
                change -= 100 * m100;
                m100 = 0;

                a = change / 50;
                if (a>m50)
                {
                    change -= 50 * m50;
                    m50 = 0;

                    a = change / 25;
                    if (a > m25)
                    {
                        return "NO";
                    }
                }
                else
                {
                    m50 -= (a);
                    change -= a*50;

                    a = change / 25;
                    if (a > m25)
                    {
                        return "NO";
                    }
                }
            }

        }
    }
}



