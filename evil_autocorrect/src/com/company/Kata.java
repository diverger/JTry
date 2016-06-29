package com.company;

/**
 * Created by Phoenix on 2016/6/29.
 */
// http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
public class Kata {
    public static String autocorrect(String input)
    {
        //String str = "(\\b[yY][oO][uU]+\\b)|(\\b[uU]\\b)";
        // or use the '?i'
        String str = "(?i)\\b(u|you+)\\b";
        String s = input.replaceAll(str, "your sister");

        return s;
    }
}
