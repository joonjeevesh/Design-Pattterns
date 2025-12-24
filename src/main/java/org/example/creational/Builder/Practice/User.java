package org.example.creational.Builder.Practice;

public class User {
    private String name;
    private String email;
    private Integer age;
    private String field1;
    private Double field2;
    private String field3;
    private Integer field4;

    private User(){};

    public static UserBuilder userBuilder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String name;
        private String email;
        private Integer age;
        private String field1;
        private Double field2;
        private String field3;
        private Integer field4;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public UserBuilder setField1(String field1) {
            this.field1 = field1;
            return this;
        }

        public UserBuilder setField2(Double field2) {
            this.field2 = field2;
            return this;
        }

        public UserBuilder setField3(String field3) {
            this.field3 = field3;
            return this;
        }

        public UserBuilder setField4(Integer field4) {
            this.field4 = field4;
            return this;
        }

        public User build() {
            User user = new User();
            user.age = age;
            user.email = email;
            user.name = name;
            user.field1 = field1;
            user.field2 = field2;
            user.field3 = field3;
            user.field4 = field4;
            return user;
        }
    }
}
