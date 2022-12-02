package org.advanceJava.ch02.persistence.dao;

import org.advanceJava.ch02.persistence.domain.Entity;
import org.advanceJava.ch02.persistence.domain.Product;

public class ProductDao extends AbstractDao {

    public ProductDao(){
        super();
    }

    @Override
    public void save(Entity e) {
        System.out.println("Saving Product entity: " + e);
        db.save(e);
    }

    @Override
    public void update(Entity e) {
        System.out.println("Updating Product entity: " + e);
        db.update(e);
    }

    @Override
    public Product retrieve(Class clazz, int id) {
        System.out.println("Retrieving Product entity.");
        Product p = (Product) db.load(clazz, id);
        return p;
    }
}
