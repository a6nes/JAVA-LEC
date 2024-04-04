package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.vo.MemberVO;

public class Application {
    public static void main(String[] args) {

        /* getter를 이용해서 필드의 초기값 확인 */

        MemberVO mem = new MemberVO();

        System.out.println("id : " + mem.getId());
        System.out.println("pwd : " + mem.getPwd());
        System.out.println("name : " + mem.getName());
        System.out.println("age : " + mem.getAge());
        System.out.println("gender : " + mem.getGender());
        System.out.println("phone : " + mem.getPhone());
        System.out.println("email : " + mem.getEmail());

        /* setter를 이용해서 필드 값 변경 */

        mem.setId("user01");
        mem.setPwd("pass01");
        mem.setName("홍길동");
        mem.setAge(20);
        mem.setGender('M');
        mem.setPhone("010-1234-5678");
        mem.setEmail("hong123@greedy.com");

        /* getter를 이용해서 변경된 필드값 확인 */

        System.out.println("변경 후 id : " + mem.getId());
        System.out.println("변경 후 pwd : " + mem.getPwd());
        System.out.println("변경 후 name : " + mem.getName());
        System.out.println("변경 후 age : " + mem.getAge());
        System.out.println("변경 후 gender : " + mem.getGender());
        System.out.println("변경 후 phone : " + mem.getPhone());
        System.out.println("변경 후 email : " + mem.getEmail());

    }
}
