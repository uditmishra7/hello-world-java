package com.udit.test;

public class HelloWorld {

    public static void main(String[] args) {
        printHello();
        printHelloWorld();
        printHelloWorld1();

        new DropDown().print();
    }

    private static void printHello() {
        System.out.println("This is Main Method.....");
    }

    private static void printHelloWorld() {
        System.out.println("This is Hello World 0");
    }

    private static void printHelloWorld1() {
        System.out.println("This is Hello World 100");
    }

}
