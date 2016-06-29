package com.company;

public class Main {

    // Note: You must precede the 'void' with 'static', becuase the 'main' is a static function,
    //       if you want to call a non-static method of a class, you must know the instance of that
    //       class.
    static void say_hello()
    {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
	// write your code here
        say_hello();
        Animal dog = new Animal();
        dog.bark();
    }
}
