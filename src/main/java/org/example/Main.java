package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("ハチ" , 6);
        System.out.println("名前は：" + dog1.getName() + "です。");
        System.out.println("年齢は：" + dog1.getAge() + "歳です。");

        Dog dog2 = new Dog("ポチ" , 3);
        System.out.println("名前は：" + dog2.getName() + "です。");
        System.out.println("年齢は：" + dog2.getAge() + "歳です。");
    }
}