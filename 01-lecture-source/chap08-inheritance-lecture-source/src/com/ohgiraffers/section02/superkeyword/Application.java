package com.ohgiraffers.section02.superkeyword;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. super와 super()에 대해 이해할 수 있다.
        *
        * super : 자식클래스를 이용해서 객체를 생성할 때 부모 생성자를 호출하여 부모 클래스의
        *         인스턴스도 함께 생성하게 된다. 이 때 생성한 부모의 인스턴스 주소를 보관하는
        *         래퍼런스 변수로 자식클래스 내의 모든 생성자와 메소드 내에서 선언하지 않고도 사용할 수 있는
        *         래퍼런스 변수이다.
        * super() : 부모 생성자를 호출하는 구문으로 인자와 매개변수 타입, 갯수, 순서가 일치하는
        *           부모 생성자를 호출하게 된다. this()가 해당 클래스 내에 다른 생성자를 호출하는
        *           구문이라면 super()는 부모클래스가 가지는 private 생성자를 제외한 나머지
        *           생성자를 호출할 수 있도록 하는 구문이다.
         */
        
        Product product1 = new Product();
        System.out.println("product1.getInformation() = " + product1.getInformation());
        
        Product product2 = new Product("S-01234", "삼성", "갤럭시Z폴드5", 3590000, new java.util.Date());
        System.out.println("product2.getInformation() = " + product2.getInformation());
        
        Computer computer1 = new Computer();
        System.out.println("computer1.getInformation() = " + computer1.getInformation());
        
        Computer computer2 = new Computer("퀄컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println("computer2.getInformation() = " + computer2.getInformation());
        
        Computer computer3 = new Computer("S-01234", "삼성", "갤럭시Z폴드5", 2590000,
                new java.util.Date(), "퀄컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println("computer3.getInformation() = " + computer3.getInformation());
    }
}
