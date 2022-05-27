package com.abstractfactorypattern;

public class BlackButton implements Button{
    @Override
    public void colour() {
        System.out.println("Button is 'BLACK' ");
    }
}
