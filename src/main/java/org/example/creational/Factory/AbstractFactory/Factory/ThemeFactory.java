package org.example.creational.Factory.AbstractFactory.Factory;

import org.example.creational.Factory.AbstractFactory.Button.Button;
import org.example.creational.Factory.AbstractFactory.InputBox.InputBox;

public interface ThemeFactory {
    public Button getButton();
    public InputBox getInputBox();
}
