package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    private Car car = new Car();

    public void startUp() {
        car.startUp();          // 윗줄의 startUp()과 아랫줄의 startUp은 이름만 같을 뿐 완전히 다르다.
    }
    public void stopAccelator() {
        car.go();
    }
    public void stopBreak() {
        car.stop();
    }
    public void turnOff() {
        car.turnOff();
    }
}
