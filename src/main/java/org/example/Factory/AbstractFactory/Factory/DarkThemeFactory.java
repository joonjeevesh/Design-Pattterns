package org.example.Factory.AbstractFactory.Factory;

import org.example.Factory.AbstractFactory.Button.Button;
import org.example.Factory.AbstractFactory.Button.RoundButton;
import org.example.Factory.AbstractFactory.InputBox.DarkInputBox;
import org.example.Factory.AbstractFactory.InputBox.InputBox;

public class DarkThemeFactory implements ThemeFactory{
    @Override
    public Button getButton() {
        return new RoundButton();
    }

    @Override
    public InputBox getInputBox() {
        return new DarkInputBox();
    }
}
