package com;

import java.util.Scanner;

public class ReadParameters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 8;
        int b = 8;
        int operation = 8;
        System.out.println("insert a");
        a = scanner.nextInt();
        System.out.println("insert b");
        b = scanner.nextInt();
        System.out.println("insert operation");
        operation = scanner.nextInt();
        if (operation == 1) {
            int sum = a + b;
            System.out.println("сумма = " + sum);
            return;
        }
        if (operation == 2) {
            int raznost = a - b;
            System.out.println("разность = " + raznost);
        } else {
            System.out.println("такой операции не существует");
        }
    }
}
