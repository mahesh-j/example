package org.mah;

public class Arithemetic {
    public static void main(String args[]) {
        int i = 12345678, res1 = 0;
        double f = 1.2345678, res2 = 0;
        
        res1 = i + (int)f;
        res2 = i + f;
        
        System.out.println("Integer Result : " + res1);
        System.out.println("Float Result : " + res2);
    }
}