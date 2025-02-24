package ru.sber.base.syntax;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int maxSize = 100;
        int[] arr = new int[maxSize];
        int maxValue = -1;
        int maxIndex = -1;
        float sum = -1;
        for (int i = 0; i < maxSize; i++) {
            arr[i] = (int) (Math.random() * 1000);
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
            sum += arr[i];
        }
        System.out.println("Массив " + Arrays.toString(arr));
        System.out.println("Максимальное значение = [" + maxValue + "] находится в элементе под индексом [" + maxIndex + 1 + "]");
        System.out.println("Среднее значение = [" + sum / maxSize + "]");
    }
}
