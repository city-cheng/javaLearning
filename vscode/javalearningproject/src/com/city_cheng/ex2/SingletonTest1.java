package com.city_cheng.ex2;

public class SingletonTest1 {
    
}

class Bank{

    private static Bank bank = new Bank();

    private Bank(){

    }

    public static Bank getBank(){
        return bank;
    }

}