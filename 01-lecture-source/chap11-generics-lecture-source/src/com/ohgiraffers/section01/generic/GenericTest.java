package com.ohgiraffers.section01.generic;

public class GenericTest<T> { // <T>는 타입변수, 가상의 타입을 설정, 여러개 사용가능(<T, B>...)
    private T value;

    public void setValue(T value) {
        this.value = value;
    }


    public T getValue() {
        return this.value;
    }
}
