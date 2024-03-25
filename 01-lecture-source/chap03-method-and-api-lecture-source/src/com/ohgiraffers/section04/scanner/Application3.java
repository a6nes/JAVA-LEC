package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /* 수업목표. 스캐너 사용 시 주의사항에 대해 이해하고 사용시 주의사항을 고려하여 사용할 수 있다. */
        /* 스캐너의 next메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
        * 그래서 크게 두 가지 사항을 주의해야 한다.
        * 1. next()로 문자열 입력을 받은 후 정수, 실수, 논리값을 받을 때
        * 2. 정수, 실수, 논리값 입력 후 next()로 문자열을 받을 때
         */

        /* 스캐너 객체 생성 */
        Scanner sc = new Scanner(System.in);

        /* 1. next()로 문자열 입력을 받은 후 정수, 실수, 논리값을 받을 때 */
        System.out.print("문자열을 입력해주세요 :");
        String str1 = sc.next(); // next 메소드 호출
        System.out.println("str1 = " + str1);

        // sc.nextLine(); // nextLine메소드 호출, 그래야 아래에서 공백이 있는 문자열 사용했을때 오류발생 x

        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.println("num1 = " + num1); // 위에서 공백이 있는 문자를 입력하면 공백 다음 문자가 num1에 넘어가기때문에 오류가 발생한다.

        /* 2. 정수, 실수, 논리값 입력 후 nextLine()으로 문자열을 받을 때 */
        System.out.print("다시 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 = " + num2);

        System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");

        sc.nextLine(); // 엔터키가 개행문자이다

        String str2 = sc.nextLine();
        System.out.println("str2 = " + str2);

    }
}
