package com.abstractfactorypattern;

public class ThemeFactory {

    public Themes ChangeingTheme(String rtheme){
        if(rtheme.equals("dark"))
            return new Black();
        else
            return new White();
    }
}
