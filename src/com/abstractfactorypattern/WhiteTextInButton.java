package com.abstractfactorypattern;

public class WhiteTextInButton implements TextInButton{
    @Override
    public void colour() {
        System.out.println("Text In Button is 'WHITE' ");
    }
}
