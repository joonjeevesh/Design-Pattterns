package org.example.creational.Builder;

import lombok.Builder;

/*
To understand lombok's Builder annotation
 */
@Builder
public class NewDatabase {
    private String host;
    private Integer port;
    private String name;
    private String password;
    private String someField;
}
