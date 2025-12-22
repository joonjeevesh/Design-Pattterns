package org.example.Factory.AbstractFactory.Factory;

import org.example.Factory.AbstractFactory.Button.Button;
import org.example.Factory.AbstractFactory.Button.PrimaryButton;
import org.example.Factory.AbstractFactory.InputBox.InputBox;
import org.example.Factory.AbstractFactory.InputBox.LightInputBox;

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
