package com.abstractfactorypattern;

public class BlackText implements Text{
    @Override
    public void colour() {
        System.out.println("Text is 'BLACK' ");
    }
}
