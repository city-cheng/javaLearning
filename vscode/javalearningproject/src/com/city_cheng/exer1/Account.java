package com.city_cheng.exer1;

public class Account {

    private int id;
    private String pwd = "000000";


    public Account(int id, String pwd, double balance) {
        this.id = id;
        this.pwd = pwd;
        this.balance = balance;
    }

    private double balance;

    private static double interestRate;
    private static double minrest = 1.0;
    private static int init = 1001; // 用于自动生成id

    public int getId() {
        return id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinrest() {
        return minrest;
    }

    public static void setMinrest(double minrest) {
        Account.minrest = minrest;
    }

    public Account(){
        id = init++;
    }

    public Account(String pwd,double balance){
        id = init++;
        this.pwd = pwd;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [balance=" + balance + ", id=" + id + "]";
    }

    

}
