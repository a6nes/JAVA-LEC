package com.ohgiraffers.section04.uses1;

public class FireCar extends Car implements Soundable{


    @Override // 오버라이딩을 하지 않으면 상위 클래스(Car)의 메소드가 사용됨
    public void go() {
        System.out.println("소방차가 달려갑니다.");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다.");
    }

    @Override
    public void horn() {
        System.out.println("경적을 울립니다. 빵빵!!");
    }
}
