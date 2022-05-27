package com.singletonpattern;

public class Netflix {
    public static void main(String args[]){

        //Opening Account in device 1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Account device1 = Account.loginAccount();
            }
        });


        //Opening Account in device 2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run(){
                Account device2 = Account.loginAccount();
            }
        });

        t1.start();
        t2.start();

    }
}
