package com.ohgiraffers.section06.singleton;

public class EagerSingleton {
    private static EagerSingleton eager = new EagerSingleton();

    private EagerSingleton() {
    } // 외부에서 인스턴스 생성 제한

    public static EagerSingleton getInstance() {
        return eager;
    }
}

