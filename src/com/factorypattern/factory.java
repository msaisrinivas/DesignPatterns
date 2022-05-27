package com.factorypattern;

public class factory {
    public combination Medicines(String str){
        if(str.equals("painKiller"))
            return new aceclofinac();
        else if(str.equals("stomachAche"))
            return new Rabiprozal();
        else
            return new calcium();
    }
}
