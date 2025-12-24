package org.example.creational.Builder;

/*
V1 had issues in terms of copying all the Database fields to DatabaseBuilder class
and then setting the same fields to database instance
Instead, we took database instance into DatabaseBuilder and
upon initialization of DatabaseBuilder object, also initialized this object
and set THIS DATABASE object values in the methods and returned THIS DATABASE object!!
No need to copy fields to DatabaseBuilder and then set ALL the fields back
to the DATABASE object
 */
public class DatabaseV2 {
    private String host;
    private Integer port;
    private String name;
    private String password;

    private DatabaseType type;

    private DatabaseV2() {}

    public static DatabaseBuilder builder() {
        return new DatabaseBuilder();
    }

    public static class DatabaseBuilder {
        private DatabaseV2 database = new DatabaseV2();

        public DatabaseBuilder withUrl(String host, Integer port) {
            database.host = host;
            database.port = port;
            return this;
        }

        public DatabaseBuilder withName(String name) {
            database.name = name;
            return this;
        }

        public DatabaseBuilder withType(DatabaseType type) {
            database.type = type;
            return this;
        }

        public DatabaseBuilder withSqlDbType() {
            database.type = DatabaseType.MYSQL;
            return this;
        }

        public DatabaseBuilder withPassword(String password) {
            database.password = password;
            return this;
        }

        public DatabaseV2 build() {
            if(!validate()) {
                throw new RuntimeException("Invalid configuration of Database object");
            }
            return database;
        }

        private boolean validate() {
            if(database.name == null) {
                return false;
            }

            return true;
        }
    }
}
