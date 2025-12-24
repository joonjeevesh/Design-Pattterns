package org.example.creational.Factory.AbstractFactory.Factory;

import org.example.creational.Factory.AbstractFactory.Button.Button;
import org.example.creational.Factory.AbstractFactory.Button.PrimaryButton;
import org.example.creational.Factory.AbstractFactory.InputBox.InputBox;
import org.example.creational.Factory.AbstractFactory.InputBox.LightInputBox;

public class LightThemeFactory implements ThemeFactory{
    @Override
    public Button getButton() {
        return new PrimaryButton();
    }

    @Override
    public InputBox getInputBox() {
        return new LightInputBox();
    }
}
