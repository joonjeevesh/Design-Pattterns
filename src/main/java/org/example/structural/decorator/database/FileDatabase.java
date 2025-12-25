package org.example.structural.decorator.database;

public class FileDatabase implements IDatabase {

    @Override
    public String read() {
        //reading from file, for right now using string as data source
        return "File";
    }

    @Override
    public void write(String str) {
        //some logic to write to a file
    }
}
