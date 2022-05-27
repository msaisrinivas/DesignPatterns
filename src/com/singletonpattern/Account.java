package com.singletonpattern;

public class Account {
    private static Account acc ;

    private Account(){
            System.out.println("Your Object is created!!! Enjoy your movies and series!!!");
    }

    public static Account loginAccount() {
        if(acc == null){
            synchronized (Account.class){
                if(acc == null){
                    acc = new Account();
                }
            }
        }
        return acc;
    }
}
