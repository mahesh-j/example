package org.mah;

import java.util.*;

public class HelloWorld2 {
    public static void main(String args[]) {
        TestClass object1 = new TestClass();
        TestClass object2 = new TestClass(3, 4);
        
        System.out.println("Result 1 : " + object1.add());
        System.out.println("Result 2 : " + object2.add());
    }
}

class TestClass {
    int a;
    int b;
    
   public TestClass() {
        this.a = 1;
        this.b = 1;
    }
    
    public TestClass(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int add() {
        return this.a + this.b;
    }
}