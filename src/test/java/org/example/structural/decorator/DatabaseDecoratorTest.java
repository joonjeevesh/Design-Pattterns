package org.example.structural.decorator;

import org.example.structural.decorator.database.FileDatabase;
import org.example.structural.decorator.database.IDatabase;
import org.junit.Assert;
import org.junit.Test;

public class DatabaseDecoratorTest {

    @Test
    public void compressEncrypt() {
        IDatabase fileDb = new FileDatabase();
        IDatabase db = CompressionDatabase.withCompressionDatabase(EncryptedDatabase.withEncryptedDatabase(fileDb));
        Assert.assertEquals("File - Decrypted - Decompressed", db.read());
    }

    @Test
    public void compress() {
        IDatabase fileDb = new FileDatabase();
        IDatabase db = new CompressionDatabase(fileDb);
        Assert.assertEquals("File - Decompressed", db.read());
    }
}
