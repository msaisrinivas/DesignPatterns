package com.abstractfactorypattern;

public class BlackTextInButton implements TextInButton{
    @Override
    public void colour() {
        System.out.println("Text In BUtton is 'BLACK' ");
    }
}
