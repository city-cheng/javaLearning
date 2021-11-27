package com.city_cheng.ex4;

import org.junit.Test;

public class InnerClassTest {
    public static void main(String[] args) {
        
        //创建Dog实例(静态的成员内部类)
        Person.Dog dog = new Person.Dog();
        dog.show();
        //创建Bird实例(非静态成员内部类)
        // Person.Bird bird = new Person.Bird();      错误的
        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();
    }

    @Test
    public void test1(){
        System.out.println("hello");
    }

}

class Person {

    String name;
    int age;

    public void eat(){
        System.out.println("人吃饭");
    }

    public void method() {
        // 局部内部类
        class AA {

        }
    }

    {
        // 局部内部类
        class BB {  

        }

    }

    public Person() {
        // 局部内部类
        class CC {

        }

    }

    // 静态成员内部类
    static class Dog {
        String name;
        int age;

        public void show(){
            System.out.println("卡拉是条狗");
        }
    }

    // 非静态成员内部类
    final class Bird {
        String name;

        public void sing(){
            System.out.println("我是一只小小小小鸟");
            eat();
            // Person.this.eat();      省略了Person.this.
        }
    }

}