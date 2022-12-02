package org.advanceJava.ch02.persistence.dao;

import org.advanceJava.ch02.persistence.db.ConnectionFactory;
import org.advanceJava.ch02.persistence.db.DBConnection;
import org.advanceJava.ch02.persistence.domain.Entity;

public abstract class AbstractDao {
    protected DBConnection db;

    public AbstractDao(){
        ConnectionFactory factory = new ConnectionFactory();
        db = factory.getConnection();
    }

    public abstract void save(Entity e);

    public abstract void update(Entity e);

    public abstract Entity retrieve(Class clazz, int id);
}
