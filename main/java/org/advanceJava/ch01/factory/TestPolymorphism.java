package org.advanceJava.ch01.factory;

public class TestPolymorphism {

    public static void main(String[] args) {
        //These are normal assignments
        System.err.println("Regular assignments");
        Employee e = new Employee(1, "Ali", 8, "Production");
        e.work();

        Manager m = new Manager(2, "Fatma", 3, "Production", "Production");
        m.work();

        Director d = new Director(4, "Mehmet", 20, "Management", "Management", 3000);
        d.work();

        //These are upcasting assignments
        System.err.println("\nUpcasting assignments - 1");
        e = m;  // Upcasting
        e.work();  // Manager is working!

        e = d;  // Upcasting
        e.work();

        System.out.println();

        //These are also upcasting assignments
        System.err.println("\nUpcasting assignments - 2");
        Employee e1 = new Employee(1, "Ali", 8, "Production");
        e1.work();  // Employee is working!
        System.out.println();

        e1 = new Manager(2, "Fatma", 3, "Production", "Production");
        e1.work();  // Manager is working!
        System.out.println();

        e1 = new Director(4, "Mehmet", 20, "Management", "Management", 3000);
        e1.work();  // Director is working!

        Boss b = new Boss();
        b.youWorkToo();  // Boss is working for you :)

    }
}
