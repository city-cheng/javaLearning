package com.city_cheng.java8;


public interface CompareA {
    
    //��̬����
    public static void method1(){
        System.out.println("CompareA:����");
    }
    
    public default void method2(){
        System.out.println("CompareA:�Ϻ�");
    }

    default void method3(){
        System.out.println("CompareA:�Ϻ�");
    }
}
