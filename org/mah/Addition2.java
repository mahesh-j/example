package org.mah;

import javax.swing.*;

public class Addition2 { 
    public static void main(String args[]) {
        String num1 = JOptionPane.showInputDialog("Enter the first Number : ");
        String num2 = JOptionPane.showInputDialog("Enter the second Number : ");
        
        int res = Integer.parseInt(num1) + Integer.parseInt(num2);
        
        JOptionPane.showMessageDialog(null, "The sum of two integers : " + res );
        //System.out.println("The sum of the two integers : " + res);
    }
}