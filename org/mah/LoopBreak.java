package org.mah;

public class LoopBreak {
    public static void main(String args[]) {
        for(int i = 0; i < 5; i++) {
            a: for (int j = 0; j < 3; j++) {
                if(i == 1 && j == 1)
                    break a;
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}