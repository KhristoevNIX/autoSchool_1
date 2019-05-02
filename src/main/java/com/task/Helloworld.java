package com.task;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Helloworld {
    public static void main(String[] args) {
        System.out.println("Hello, World :)");
        name();
    }

    public static void name(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.nextLine();
        System.out.println("Hello, " + name + " :)");
    }
}
