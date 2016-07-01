package com.company;

//import org.omg.CORBA.Object;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rotator r = new Rotator();

        //System.out.println( r.rotate().toString() );
        Object[] obj = r.rotate(new Object[] {1, 2, 3, 4, 5}, -5);

        for ( int i = 0; i < obj.length; ++i )
        {
            System.out.print( obj[i] );
            System.out.print( ' ' );
        }
    }
}
