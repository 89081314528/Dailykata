package com;

/** Массив с днями недели
 * Метод, который распечатывает все элементы массива
 * Метод, который считает сумму, метод, который считает произведение
 * Метод applyOperation, который в зависимости от номера операции возвращает сумму или произведение
 * Метод, который считает степень числа
 * Добавить метод, который считает степень в applyOperation
 */

public class Main {
    public static void main(String[] args) {
      String[] day = new String[3];
      day[0] = "a";
      day[1] = "s";
      day[2] = "d";
      printDays(day);
        System.out.println(operation(4,2,1));
        System.out.println(operation(4,2,2));
        System.out.println(operation(2,4,3));
    }
    public static void printDays(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static int operation(int a, int b, int operation) {
        if (operation == 1) {
            return sum(a, b);
        }
        if (operation == 2) {
            return product(a, b);
        }
        return stepen(a, b);
    }

    public static int stepen(int a, int b) {
        int chislo = a;
        for (int i = 1; i < b; i++) {
            a = a * chislo;
        }
        return a;
    }
}
