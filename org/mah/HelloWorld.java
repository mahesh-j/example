package org.mah;

public class HelloWorld {
    public static void main(String args[]) {
        if(args.length > 0) {
            System.out.println("You passed the below arguments");
            for(int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        } else
            System.out.println("You passed no Arguments\n");
    }
}