package org.advanceJava.ch01.binding;

public class StaticMethodShadowing {
    public static void main(String[] args) {
        Parent parent = new Child1();
        parent.doIt();  // Parent class is doing it!
        parent.make();  // The object of Child1 is making something!
        System.out.println();

        parent = new Child2();
        parent.doIt();  // Parent class is doing it!
        parent.make();  // The object of Child2 is making something!
        System.out.println();

        Child1 child1 = new Child1();
        child1.doIt();  // Child1 class is doing it!
        Child2 child2 = new Child2();
        child2.doIt();  // Child2 class is doing it!

        System.out.println();

        System.out.println(Parent.i);  // 5
        System.out.println(parent.j);  // 9

        System.out.println(Child1.i);  // 15
        System.out.println(child1.j);  // 19

        System.out.println(Child2.i);  // 25
        System.out.println(child2.j);  // 29
    }
}
