package school;

import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name please");
        String name = scanner.nextLine();

        Hello hello = new Hello();
        hello.setupName(name);
        hello.welcome();
        System.out.println("Hello, World");
        hello.byeBye();
    }
}

