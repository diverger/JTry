package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Please input a line of string and press ENTER.");
        Scanner my_var = new Scanner(System.in);
        System.out.println( "What's you have input: " + my_var.nextLine());
    }
}
