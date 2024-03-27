package com.ohgiraffers.test1;
import java.lang.Math;
import java.util.Scanner;
public class TestMethod {
    public void Calculator(int a, int b) {

        int sum = a + b;
        int minus = a - b;
        int multiple = a * b;
        int divide = a / b;
        int rest = a % b;
        System.out.println("두 수의 합 : " + sum);
        System.out.println("두 수의 차 : " + minus);
        System.out.println("두 수의 곱 : " + multiple);
        System.out.println("두 수의 나눔 : " + divide);
        System.out.println("두 수의 나머지 : " + rest);
    }

    public double CircleArea(double num) {

        final double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        return pi * r * r;
    }

    public static String TestRandom() {
        int randomNumber = (int)(Math.random() * 10) + 1;
        String message = "생성된 난수는 " + randomNumber + "입니다.";
        return message;
    }
}
