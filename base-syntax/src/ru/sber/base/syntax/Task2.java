package ru.sber.base.syntax;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int q = scan.nextInt();
        if (q < 1 || q > 500) {
            System.out.println("Введено недопустимое число "+ q + ". Допустимый диапазон значений: 1 - 500");
        } else {
            for (int i = 1; i <= q; i++) {
                System.out.print((i * 7) + " ");
            }
        }
    }
}
