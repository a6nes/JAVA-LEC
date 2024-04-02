package com.ohgiraffers.section01.extend;

public class FireCar extends Car {  // FireCar 클래스가 Car클래스를 상속 받음

    public FireCar() {

        super();    // 부모의 기본 생성자 호출, 작성하지 않아도 에러는 안나지만 명시해줘야함
        System.out.println("FireCar 클래스의 기본 생성자 호출됨");
    }

    @Override
    public void soundHorn() {

        if (isRunning()) {
            System.out.println("빠아앙아아앙앙!!!!!!!빠아앙아아앙!!!!!!");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다 비키세요 비켜~~~!!!");
        }
    }

    public void sprayWater() {

        System.out.println("불난 곳을 발견했습니다 물을 뿌립니다 ==================");
    }
}