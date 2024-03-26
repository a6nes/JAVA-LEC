package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {

        A_if a = new A_if();
        /* 단독 if 문 흐름 확인용 메소드 출력 */
        // a.testSimpleIfStatement();

        /* 중첩 if문 흐름 확인용 메소드 출력 */
//        a.testNestedIfStatement();

        /* 단독 if-else문 흐름 확인용 메소드 출력 */
        B_ifElse b = new B_ifElse();
//        b.simpleIfElseStatement();

        /* 중첩 if-else문 흐름 확인용 메소드 출력 */
        B_ifElse b1 = new B_ifElse();
//        b1.testNeatedIfElseStatement();

        C_ifElseif c = new C_ifElseif();
//        c.testSimpleIfElseIfStatement();

           C_ifElseif c1 = new C_ifElseif();
//        c1.testNestedIfElseIfStatement();

        D_switch d = new D_switch();
           d.testSimpleSwitchStatement();
//       d.testSwitchVendingMachine();




    }
}
