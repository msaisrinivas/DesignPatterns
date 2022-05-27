package com.abstractfactorypattern;

public class Black implements Themes{
    public Black(){
        System.out.println("\n\nChanged Into 'DARK Theme'  \n");
    }

    @Override
    public void Theme(){
        BackGround bbg = new BlackBG();
        Text wt = new WhiteText();
        Button wb = new WhiteButton();
        TextInButton btib = new BlackTextInButton();
        bbg.colour();
        wt.colour();
        wb.colour();
        btib.colour();
    }
}
