package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    private int nonStaticCount;
    private static int staticCount;

    public StaticFieldTest(){}

    public int getNonStaticCount() {
        return this.nonStaticCount;
    }
    public int getStaticCount() {
        return StaticFieldTest.staticCount;
    }   // static 선언?

    public void increaseNonStaticCount() {this.nonStaticCount++;}

    public void increaseStaticCount() {StaticFieldTest.staticCount++;}
}
