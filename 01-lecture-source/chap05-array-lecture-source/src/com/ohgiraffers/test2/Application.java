package com.ohgiraffers.test2;
import com.ohgiraffers.test1.TestMethod;
import static com.ohgiraffers.test1.TestMethod.TestRandom;
public class Application {
    public static void main(String[] args) {
        TestMethod t1 = new TestMethod();
        t1.Calculator(2, 5);

        System.out.print("반지름을 입력하세요 : ");
        double area = t1.CircleArea(3);
        System.out.println("원의 넓이는 " + area + " 입니다.");

        System.out.println(TestMethod.TestRandom());
    }
}
