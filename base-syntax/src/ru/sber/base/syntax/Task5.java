package ru.sber.base.syntax;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int s = scanner.nextInt();
        int q = 0;
        int w = 1;
        if (s >= 2 && s <= 100) {
            System.out.print("0 1");
            for (int i = 2; i <= s - 1; ++i) {
                int next = q + w;
                q = w;
                w = next;
                System.out.print(" " + w);
            }
        } else {
            System.out.println("Введено недопустимое число " + s + ". Допустимый диапазон значений: 2 - 100.");
        }
    }
}