package com.ohgiraffers.section01.uses;

public class MemberRepository {

    private final static Member[] member;   // Member클래스의 객체를 담을수 있는 배열명(member)을 가진 배열 생성;
    private static int count;

    static {
        member = new Member[10];
    }

    public static boolean store(Member[] members) {

        for(int i = 0; i < members.length; i++) {
            member[count++] = members[i];
        }
        return true;
    }

    public static Member[] findAllMembers() {
        return member;
    }
}
