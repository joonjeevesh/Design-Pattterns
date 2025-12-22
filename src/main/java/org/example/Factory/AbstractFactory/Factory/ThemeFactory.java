package org.example.Factory.AbstractFactory.Factory;

import org.example.Factory.AbstractFactory.Button.Button;
import org.example.Factory.AbstractFactory.InputBox.InputBox;

public interface ThemeFactory {
    public Button getButton();
    public InputBox getInputBox();
}
