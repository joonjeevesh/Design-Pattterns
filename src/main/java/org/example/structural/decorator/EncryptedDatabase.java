package org.example.structural.decorator;

import org.example.structural.decorator.database.IDatabase;

public class EncryptedDatabase extends DatabaseDecorator {

    public EncryptedDatabase(IDatabase db) {
        this.db = db;
    }

    @Override
    public String read() {
        return StringUtils.decrypt(db.read());
    }

    @Override
    public void write(String str) {
        db.write(StringUtils.encrypt(str));
    }

    public static EncryptedDatabase withEncryptedDatabase(IDatabase db) {
        EncryptedDatabase instance = new EncryptedDatabase(db);
        return instance;
    }
}
