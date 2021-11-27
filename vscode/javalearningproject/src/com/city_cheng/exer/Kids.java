package com.city_cheng.exer;

public class Kids extends ManKind{
    private int age;

    public Kids() {
    }

    public Kids(int age) {
        this.age = age;
    }

    public void printAge() {
        System.out.println("I am " + age + " years old.");
    }

    public int getYearsOld() {
        return age;
    }

    public void setYearsOld(int age) {
        this.age = age;
    }

}
