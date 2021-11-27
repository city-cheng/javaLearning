package com.city_cheng.ex4;

import org.junit.Test;

public class InnerClassTest {
    public static void main(String[] args) {
        
        //����Dogʵ��(��̬�ĳ�Ա�ڲ���)
        Person.Dog dog = new Person.Dog();
        dog.show();
        //����Birdʵ��(�Ǿ�̬��Ա�ڲ���)
        // Person.Bird bird = new Person.Bird();      �����
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
        System.out.println("�˳Է�");
    }

    public void method() {
        // �ֲ��ڲ���
        class AA {

        }
    }

    {
        // �ֲ��ڲ���
        class BB {  

        }

    }

    public Person() {
        // �ֲ��ڲ���
        class CC {

        }

    }

    // ��̬��Ա�ڲ���
    static class Dog {
        String name;
        int age;

        public void show(){
            System.out.println("����������");
        }
    }

    // �Ǿ�̬��Ա�ڲ���
    final class Bird {
        String name;

        public void sing(){
            System.out.println("����һֻСССС��");
            eat();
            // Person.this.eat();      ʡ����Person.this.
        }
    }

}