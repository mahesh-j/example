package org.oops;

import static java.lang.System.*;

public class EmployeeTest { 
    public static void main(String args[]) {
        Employee employee1 = new Employee("employee1", 10, 20);
        Employee employee2 = new Employee("employee2", 30, 40);
        
        out.println("Before Change");
        employee1.printDetails();
        employee2.printDetails();
        
        swap(employee1, employee2);
        
        out.println("After Change");
        employee1.printDetails();
        employee2.printDetails();
    }
    
    public static void swap(Employee e1, Employee e2) {
        Employee temp = e1;
        e1 = e2;
        e2 = temp;
        
        out.println("End Method");
        e1.printDetails();
        e2.printDetails();
    }
}

class Employee  {
    private int a;
    private int b;
    private String name = null;
    
    public Employee(String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }
        
    public void printDetails() {
        out.println(this.name + " | a = " + this.a + " | b = " + this.b);
    }
}