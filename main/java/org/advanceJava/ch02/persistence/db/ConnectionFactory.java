package org.advanceJava.ch02.persistence.db;

public class ConnectionFactory {

    public DBConnection getConnection() {
        return new DBConnection();
    }
}
