package ru.sber.base.syntax;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите a = ");
        long a = scan.nextInt();
        System.out.print("Введите b = ");
        long b = scan.nextInt();
        System.out.print("Введите c = ");
        long c = scan.nextInt();
        long D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("Корней нет");
        } else if (D == 0) {
            System.out.println("Корень уравнения x = " + (-b + Math.sqrt(D)) / a / 2.0 );
        } else {
            System.out.println("Корень уравнения x1 = " + (-b + Math.sqrt(D)) / a / 2.0);
            System.out.println("Корень уравнения x2 = " + (-b - Math.sqrt(D)) / a / 2.0);
        }
    }
}
