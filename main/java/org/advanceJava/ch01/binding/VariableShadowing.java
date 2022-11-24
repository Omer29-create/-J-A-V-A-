package org.advanceJava.ch01.binding;

public class VariableShadowing {

    public static void main(String[] args) {
        Parent parent = new Parent();

        Child1 child1 = new Child1();
        Child2 child2 = new Child2();

        System.out.println(Parent.i);  // 5
        System.out.println(parent.i);  // 5
        System.out.println(parent.j);  // 9

        System.out.println();

        System.out.println(Child1.i);  // 15
        System.out.println(child1.j);  // 19

        System.out.println();

        System.out.println(Child2.i);  // 25
        System.out.println(child2.j);  // 29
    }
}
