package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product/*, java.util.Scanner */ {
// 두개이상은 상속이 불가

    public SmartPhone(){}
    @Override
    public void absMethod() {
        System.out.println("Product 클래스의 absMethod를 오버라이딩한 메소드 호출함...");
    }

    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함...");
    }
}