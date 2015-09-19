package org.mah;

import java.util.*;

public class Addition {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the first Number : " );
        int num1 = in.nextInt();
        
        System.out.print("Enter the second Number : " );
        int num2 = in.nextInt();
        
        int res = num1 + num2;
        System.out.println("Result : " + res);
    }
}