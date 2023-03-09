package org.example;

import java.util.Arrays;
import java.util.Random;

//Первый семинар.
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//        Пункты реализовать в методе main
public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание за 1 семинар");

        int i = new Random().nextInt(2000); // решение 1 вопроса
        System.out.println("Случайное число - " + i);

        int n = Integer.toBinaryString(i).length(); // решение 2 вопроса
        System.out.println("Старший бит в данном числе - " + n);

        int maxArraySize = (32767-i)/n + 1; // решение 3 вопроса
        int[] m1 = new int[maxArraySize];
        int m1_array_nextIndex = 0;
        for (int j = i; j < 32768; j++) {
                if (j % n == 0)
                {
                    m1[m1_array_nextIndex] = j;
                    m1_array_nextIndex ++;
                }
        }
        System.out.println(Arrays.toString(m1));

        int[] m2 = new int[65535]; // решение 4 вопроса
        int m2_array_nextIndex = 0;
        for (int j = -32768; j < i; j++) {
            if (j % n != 0)
            {
                m2[m2_array_nextIndex] = j;
                m2_array_nextIndex ++;
            }
        }
        System.out.println(Arrays.toString(m2));
    }


}