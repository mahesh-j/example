package org.mah2;

public class TestAccess {
    private String name = "";
    public TestAccess() {
        this.name = "Hello, World!";
    }
    
    public void displayName() {
        System.out.println(this.name);
    }
}