package com.abstractfactorypattern;

public class AbstractFactoryPattern {
    public static void main(String args[]){
        ThemeFactory tf = new ThemeFactory();

        Themes t = tf.ChangeingTheme("dark");
        t.Theme();

        t = tf.ChangeingTheme("white");
        t.Theme();
    }
}
