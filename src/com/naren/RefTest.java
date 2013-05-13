package com.naren;

public class RefTest {

    public static void printClassName() {
        Class clazz = RefTest.class;

        System.out.println(clazz.getCanonicalName());
    }

}
