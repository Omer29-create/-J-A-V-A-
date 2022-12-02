package org.advanceJava.ch02.persistence.db;

import org.advanceJava.ch02.persistence.domain.Employee;
import org.advanceJava.ch02.persistence.domain.Entity;
import org.advanceJava.ch02.persistence.domain.Product;

public class DBConnection {

    public void save(Object o){
        System.out.println("Saving object: " + o);
    }

    public void update(Object o){
        System.out.println("Updating object: " + o);
    }

    public Entity load(Class c, int id ){
        System.out.println("Retrieving object by id: " + id);

        Entity e = null;
        if(c.getName().equalsIgnoreCase("org.javaturk.oofp.ch03.perisstence.domain.Product"))
            e = new Product(id, "11111111", "A pen.", 2.19, 0.01);
        else
            e = new Employee(id, "Ali", 4, "Production", "xxx");
        return e;
    }
}
