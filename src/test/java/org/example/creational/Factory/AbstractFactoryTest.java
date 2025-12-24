package org.example.creational.Factory;

import org.example.creational.Factory.AbstractFactory.Button.RoundButton;
import org.example.creational.Factory.AbstractFactory.Factory.DarkThemeFactory;
import org.example.creational.Factory.AbstractFactory.Factory.ThemeFactory;
import org.example.creational.Factory.AbstractFactory.InputBox.DarkInputBox;
import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void abstractFactoryOutputNotNull() {
        ThemeFactory themeFactory = new DarkThemeFactory();

        Assert.assertNotNull("Abstract factory broken", themeFactory);
        Assert.assertTrue("Dark theme should have round button",
                themeFactory.getButton() instanceof RoundButton);
        Assert.assertTrue("Dark theme should have dark input box",
                themeFactory.getInputBox() instanceof DarkInputBox);
    }
}
