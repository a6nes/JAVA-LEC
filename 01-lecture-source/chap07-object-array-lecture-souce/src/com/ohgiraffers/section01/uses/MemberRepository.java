package com.ohgiraffers.section01.uses;

public class MemberRepository {

    private final static Member[] member;   // Member클래스의 객체를 담을수 있는 배열명(member)을 가진 배열 생성;
    private static int count;

    static {
        member = new Member[10]; // static 을 사용하지 않으면 컴파일 에러 why? final은 선언과 동시에 초기화를 해줘야한다. 배열의 크기(길이)가 10이고,참조명 member를 가지는 객체 배열 생성
    }

    // static{}의 실행순서 혼동 : static{}이 가장먼저 실행되는것은 맞다. 앞의 변수 선언부는 실행하는것이아니라 클래스가 메모리에 로딩될때 처리되는것이다. 그래서 실행과 처리는 같은선상에서 비교 x

    public static boolean store(Member[] members) { // 매개변수로 Member클래스의 타입의 members 객체배열의 요소값을 가짐

        for(int i = 0; i < members.length; i++) {
            member[count++] = members[i]; // count 초기값 = 0;
        }                                                       // member 객체배열에
        return true;
    }

    public static Member[] findAllMembers() {
        return member;
    } // Member의 객체배열 타입의 메소드선언, 리턴타입도 객체배열을 리턴
}
