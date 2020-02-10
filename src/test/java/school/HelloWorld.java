package school;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        printHelloName();
    }

    public static void printHelloName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name please");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
    }
}
