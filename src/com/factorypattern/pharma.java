package com.factorypattern;

public class pharma {
    public static void main(String args[]){
        factory fac = new factory();

        combination comb= fac.Medicines("painKiller");
        comb.compoundsadded();
        comb= fac.Medicines("stomachAche");
        comb.compoundsadded();
        comb=fac.Medicines("lowcalcium");
        comb.compoundsadded();
    }
}
