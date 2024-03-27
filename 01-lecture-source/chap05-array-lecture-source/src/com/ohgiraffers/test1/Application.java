package com.ohgiraffers.test1;

public class Application {
    public static void main(String[] args) {

        byte bnum = 1;
        short snum = 2;
        int inum = 3;
        long lnum = 4L; // 뒤에 접미사L 붙혀주기
        float fnum = 1.0f; // 뒤에 접미사f 붙혀주기
        double dnum = 2.0;
        char ch = 'a';
        boolean isTrue = true;

        long sum = inum + lnum; // 자동 형변환 long -> int

        String result = (sum > 0) ? "0 보다 큽니다." : "0이거나 0보다 작습니다.";
    }
}
