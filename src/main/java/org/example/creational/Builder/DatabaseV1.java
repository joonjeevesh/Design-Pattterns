package org.example.creational.Builder;

public class DatabaseV1 {
    private String host;
    private Integer port;
    private String name;
    private String password;
    private String someField;

    private DatabaseType type;

    private DatabaseV1() {}

    public static DatabaseBuilder builder() {
        return new DatabaseBuilder();
    }

    public static class DatabaseBuilder {
        private String host;
        private Integer port;
        private String name;
        private String password;
        private DatabaseType type;


        public DatabaseBuilder withUrl(String host, Integer port) {
            this.host = host;
            this.port = port;
            return this;
        }

        public DatabaseBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public DatabaseBuilder withType(DatabaseType type) {
            this.type = type;
            return this;
        }

        public DatabaseBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public DatabaseV1 build() {
            if(!validate()) {
                throw new RuntimeException("Invalid configuration of Database object");
            }
            DatabaseV1 database = new DatabaseV1();
            database.name = this.name;
            database.port = this.port;
            database.host = this.host;
            database.type = this.type;
            database.password = this.password;

            return database;
        }

        private boolean validate() {
            if(this.name == null) {
                return false;
            }

            return true;
        }
    }
}
