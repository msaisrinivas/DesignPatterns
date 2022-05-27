package com.abstractfactorypattern;

public class WhiteText implements Text{
    @Override
    public void colour() {
        System.out.println("Text is 'WHITE' ");
    }
}
