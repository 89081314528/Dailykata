package com;

import java.util.Scanner;

public class ReadParameters {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = 8;
        int b = 8;
        System.out.println("insert a");
        a = scanner.nextInt();
        System.out.println("insert b");
        b = scanner.nextInt();
        int sum = a + b;
        System.out.println("сумма = " + sum);
    }
}
