package org.mah;

public class ArrayCopyDemo {
    public static void main(String args[]) {
        int a[] = new int[] {1, 2, 3, 4, 5};
        int b[] = new int[5];
        for (int x : a) 
            System.out.println(x);
        
        System.arraycopy(a, 0, b, 0, a.length);
        
        for(int x: b)
            System.out.println(x);
    }
}