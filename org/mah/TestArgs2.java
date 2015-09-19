package org.mah;

public class TestArgs2 {
    public static void main(String args[]) {
        for(String arg : args){
            System.out.println(arg);
        }
        
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}