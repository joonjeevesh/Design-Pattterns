package org.example.creational.Singleton;

public class ConnectionPool {

    private static ConnectionPool instance;

    private ConnectionPool() {

    }

    public static ConnectionPool getInstance() {
        if(instance == null) {
            synchronized (ConnectionPool.class) {
                if(instance == null) {
                    instance = new ConnectionPool();
                }
            }
        }
        return instance;
    }
}
