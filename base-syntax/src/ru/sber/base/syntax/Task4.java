package ru.sber.base.syntax;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scan.nextInt();
        int i = 2;
        boolean prime = true;
        while (i <= sqrt(n)) {
            if (n % i == 0) {
                prime = false;
                break;
            }
            i ++;
        }
        if ((prime) || (n == 2) || (n == 3)) {
            System.out.print("Да");
        } else {
            System.out.print("Нет");
        }
    }
}
