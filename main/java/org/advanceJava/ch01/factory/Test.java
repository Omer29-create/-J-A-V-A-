
package org.advanceJava.ch01.factory;

public class Test {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ali", 8, "Production");
//		e1.printInfo();
//		System.out.println("MaaÅŸÄ±: " + e1.calculateSalary());
        e1.work();  // Employee is working!

        System.out.println();

        Manager m1 = new Manager(2, "Fatma", 3, "Production", "Production");
//		m1.printInfo();
//		System.out.println("MaaÅŸÄ±: " + m1.calculateSalary());
        m1.work();  // Manager is working!

        System.out.println();

        Director d1 = new Director(4, "Mehmet", 20, "Management", "Management", 3000);
//		d1.printInfo();
//		System.out.println("MaaÅŸÄ±: " + d1.calculateSalary());
        d1.work();  // Director is working!
                    // Director manages whole company!
                    // Director makes a strategic plan for the company!
    }
}
