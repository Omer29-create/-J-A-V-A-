package org.advanceJava.ch01.factory.binding;

import org.advanceJava.ch01.factory.*;

public class BindingTest {

    public static void main(String[] args) {
        HR hr = new HR();

        Employee e = hr.getAnEmployee();
        e.work();

        Boss boss = new Boss();
        boss.youWorkToo();
    }
}
