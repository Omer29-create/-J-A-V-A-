package org.advanceJava.ch01.factory.downcasting;

import org.advanceJava.ch01.factory.*;

public class InstanceofExample {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ali", 4, "Production");

        if(e1 instanceof Manager){
            System.out.println("e1 is an instance of Manager");
            Manager m1 = (Manager) e1;
            System.out.println(m1.toString());
        }
        else
            System.out.println("e1 isn't an instance of Manager");  // burasi calisti

        System.out.println();

        Employee e2 = new Manager(5, "Ä°smail", 14, "Production", "Production");
        if(e2 instanceof Manager){
            System.out.println("e2 is an instance of Manager");  // burasi calisti
            Manager m2 = (Manager) e2;
        }
        else
            System.out.println("e2 isn't an instance of Manager");

        System.out.println();

        Employee e3 =  new Manager(5, "Ä°smail", 14, "Production", "Production");

        if(e3 instanceof Director){
            System.out.println("e3 is an instance of Director");
            Director d1 = (Director) e3;
        }
        else
            System.out.println("e3 isn't an instance of Director");  // burasi calisti

        System.out.println();

        Employee e4 = new Employee(1, "Ali", 4, "Production");
//		Employee e4 = new Director(4, "Mehmet", 20, "Management", "Management", 3000);

        if(e4 instanceof Director){
            System.out.println("e4 is an instance of Director");
            Director d1 = (Director) e4;
            d1.makeAStrategicPlan();
        }
        else if(e4 instanceof Manager){
            System.out.println("e4 is an instance of Manager");
            Manager m1 = (Manager) e4;
        }
        else if(e4 instanceof Employee){
            System.out.println("e4 is an instance of Employee");  // burasi calisti
        }
        else
            System.out.println("e4 isn't an instance of Employee");


    }
}
