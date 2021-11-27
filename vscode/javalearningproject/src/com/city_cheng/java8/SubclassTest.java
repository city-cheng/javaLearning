package com.city_cheng.java8;

public class SubclassTest {
    public static void main(String[] args) {
        Subclass s = new Subclass();
        
        CompareA.method1(); 
        s.method2();
    }
}

class Subclass implements CompareA{

}