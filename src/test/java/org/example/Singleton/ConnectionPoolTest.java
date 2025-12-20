package org.example.Singleton;

import org.junit.Assert;
import org.junit.Test;

public class ConnectionPoolTest {

    @Test
    public void sameInstance() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();

        ConnectionPool connectionPool1 = ConnectionPool.getInstance();

        Assert.assertEquals("Connection pool singleton instances are equal",
                connectionPool, connectionPool1);
    }
}
