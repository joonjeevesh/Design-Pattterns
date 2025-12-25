package org.example.structural.decorator.database;

public class MySqlDatabase implements IDatabase{

    String string = "";

    @Override
    public String read() {
        return string;
    }

    @Override
    public void write(String str) {
        //some logic to write to mysql
        this.string = str;
    }
}
