package com.abstractfactorypattern;

public class White implements Themes{
    public White(){
        System.out.println("\n\nChanged into 'WHITE Theme' \n");
    }
    @Override
    public void Theme() {
        BackGround wbg = new WhiteBG();
        Text bt = new BlackText();
        Button bb = new BlackButton();
        TextInButton wtib = new WhiteTextInButton();
        wbg.colour();
        bt.colour();
        bb.colour();
        wtib.colour();
    }
}
