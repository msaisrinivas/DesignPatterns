package com.abstractfactorypattern;

public class WhiteButton implements Button{
    @Override
    public void colour() {
        System.out.println("Button is 'WHITE' ");
    }
}
