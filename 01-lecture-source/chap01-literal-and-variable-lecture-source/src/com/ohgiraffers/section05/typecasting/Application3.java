package com.ohgiraffers.section05.typecasting;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 자동형변환과 강제형변환을 이용하여 서로 다른 자료형끼리 연산을 수행할 수 있다. */
        /*
         * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리 연산
         * 다른 자료형끼리 연산은 큰 자료형으로 자동형변환 후 연산처리된다.
         */

        int inum = 10;
        long lnum = 100;

        /* 목차 1. 목차 두 수의 연산 결과를 int형으로 변환 후 int 자료형 변수에 리턴받는다. */

        // int isum = inum + lnum;

        int isum1 = (int) (inum + lnum);
        System.out.println(isum1);

        /* 목차 2. long형 값을 int로 강제 형변환한다. */

        int isum2 = inum + (int)lnum;
        System.out.println(isum2);

        /* 목차 3. 결과값을 long으로 받는다. (자동형변환 이용) */
        long lsum = inum + lnum;
        System.out.println(lsum);

        /* 주의사항 : int 미만의 연산 처리 결과는 int형이다. */
        byte bnum1 = 1;
        byte bnum2 = 2;
        short snum1 = 3;
        short snum2 = 4;

        // short snum = bnum1 + snum1; 에러발생
        // byte b = bnum1 + bnum2;
        int result1 = bnum1 + snum1;
        int result2 = bnum1 + snum1;
        int result3 = snum1 + snum2;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);








    }
}