package org.example.structural.decorator;

import org.example.structural.decorator.database.IDatabase;

public class CompressionDatabase extends DatabaseDecorator {

    public CompressionDatabase(IDatabase db) {
        this.db = db;
    }

    @Override
    public String read() {
        return StringUtils.decompress(db.read());
    }

    @Override
    public void write(String str) {
        db.write(StringUtils.compress(str));
    }

    public static CompressionDatabase withCompressionDatabase(IDatabase db) {
        CompressionDatabase instance = new CompressionDatabase(db);
        return instance;
    }
}
