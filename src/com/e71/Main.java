package com.e71;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        if (Array.getLength(args) == 0) {
            System.out.println("Hello, World!");
        } else {
            System.out.println("Hello, " + args[0] + "!");
        }
    }
}
