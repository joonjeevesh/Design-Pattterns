package org.example.structural.decorator;

import org.example.structural.decorator.database.IDatabase;

public abstract class DatabaseDecorator implements IDatabase {
    protected IDatabase db;
}
