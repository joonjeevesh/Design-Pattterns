package org.example.creational.Builder;

import org.example.creational.Builder.DatabaseType;
import org.example.creational.Builder.DatabaseV1;
import org.example.creational.Builder.DatabaseV2;
import org.example.creational.Builder.NewDatabase;
import org.junit.Assert;
import org.junit.Test;

public class DatabaseTest {

    @Test
    public void v1InstanceCreatedSuccessfully() {
        DatabaseV1 database = DatabaseV1.builder()
                .withName("connection")
                .withPassword("pass")
                .withUrl("localhost", 3000)
                .withType(DatabaseType.MYSQL)
                .build();

        Assert.assertNotNull("Database object not created", database);
    }

    @Test(expected = RuntimeException.class)
    public void v1NameNullRuntimeException() {
        DatabaseV1 database = DatabaseV1.builder()
                .withPassword("pass")
                .withUrl("localhost", 3000)
                .withType(DatabaseType.MYSQL)
                .build();
    }

    @Test
    public void v2InstanceCreatedSuccessfully() {
        DatabaseV2 database = DatabaseV2.builder()
                .withName("connection")
                .withPassword("pass")
                .withUrl("localhost", 3000)
                .withSqlDbType()
                .build();

        Assert.assertNotNull("Database object not created", database);
    }

    @Test
    public void lombokInstanceCreatedSuccessfully() {
        NewDatabase database = NewDatabase.builder()
                .name("connection")
                .password("pass")
                .host("localhost")
                .port(3000)
                .build();

        Assert.assertNotNull("Database object not created", database);
    }

}
