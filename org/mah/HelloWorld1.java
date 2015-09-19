package org.mah;

import java.util.*;

public class HelloWorld1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a;
        
        System.out.println("Enter a string : " );
        String name = in.nextLine();
        
        System.out.println("You entered : " + name);
    }
}