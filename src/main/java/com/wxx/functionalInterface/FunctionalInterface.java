package com.wxx.functionalInterface;

/**
 * java8 interface add default and static method
 */
public interface FunctionalInterface {

    //common sbstract method
    public void reference();

    //interface default method
    default void defaultMehtod() {
        System.out.println("This is a default method~");
    }

    //interface second default method
    default void anotherDefaultMehtod() {
        System.out.println("This is the second default method~");
    }

    //interface static method
    static void staticMethod() {
        System.out.println("This is a static method~");

    }

    //interface second static method
    default void anotherStaticMethod() {
        System.out.println("This is the second static method~");
    }
}
