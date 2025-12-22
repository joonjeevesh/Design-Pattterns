package org.example.Factory;

import org.example.Factory.AbstractFactory.Button.RoundButton;
import org.example.Factory.AbstractFactory.Factory.DarkThemeFactory;
import org.example.Factory.AbstractFactory.Factory.ThemeFactory;
import org.example.Factory.AbstractFactory.InputBox.DarkInputBox;
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
