package org.mah;

public class CodePointTest {
    public static void main(String args[]) {
        String test = "Hello";
        char codePointChar = '\u0048';
        
        for(int i = 0; i < test.length(); i++) {
            codePointChar = (char)test.codePointAt(i);
            System.out.println(codePointChar);
        }
    }
}