package com.ohgiraffers.section02.package_and_import;


import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;


public class Application2 {
    public static void main(String[] args) {
        /* 수업목표. 임포트에 대해 이해할 수 있다. */
        /*
        * 임포트란?
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야한다.
        * 하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
        * 그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import문이다.
        * import 는 package 선언문과 class 선언문 사이에 작성하며
        * 어떠한 패키지 내에 클래스를 사용할 것인지 선언하는 효과를 가진다.
         */

        /* 1. non-static method의 경우 */
        Calculator cal = new Calculator();  // Calculator 클래스에 cal 이름을 가진 객체 생성
        int min = cal.minNumberOf(50, 60);  // cal.minNumberOf()는 메소드 호출(객체명.메소드명), return 값을 정수형 변수 min 에 대입
        System.out.println("50과 60 중 더 작은 값은? : " + min);
        System.out.println("50과 60 중 더 작은 값은? : " + cal.minNumberOf(50, 60)); // non-static + 다른 클래스 + 다른 패키지

        /* 2. static method의 경우 */
        int max = maxNumberOf(50, 60);
        System.out.println("50과 60 중 더 큰 값은? " + max);
        System.out.println("50과 60 중 더 큰 값은? " + Calculator.maxNumberOf(50,60));

        /* 3. static 메소드를 호출할 때 클래스명을 생략하고 사용할 수 있다. */
        int max2 = maxNumberOf(100,200);
        System.out.println();


    }
}
