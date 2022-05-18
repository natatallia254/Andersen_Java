package Lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp_2 {
    public static void main(String[] args) {
        //Task_1();
        Task_1_1(100, 3);
        Task_2(-10);
        Task_3(10);
        Task_4("Приветулечки тебе!", 6);
        Task_5();
        Task_6();
        Task_7();
        Task_8();
        Task_9(10, 15);
        //Task_10(new int[]{1, 2, 3}, 1);
        Task_11();
    }

    /*public static void Task_1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = sc.nextInt();
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
        System.out.println();
    }*/

    public static boolean Task_1_1(int m, int n) {
        int l = m + n;
        if (l >= 10 && l <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void Task_2(int a) {
        if (a >= 0) {
            System.out.println("Число a=" + a + " положительное");
        } else {
            System.out.println("Число a=" + a + " отрицательное");
        }
        System.out.println();
    }

    public static boolean Task_3(int q) {
        if (q >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void Task_4(String txtToPrint, int s) {
        for (int i = 0; i < s; i++) {
            System.out.println(txtToPrint);
        }
        System.out.println();
    }

    public static void Task_5() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный одномерный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Заменим 0 на 1, 1 на 0:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void Task_6() {
        int[] array = new int[100];
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = counter;
            System.out.print(array[i] + " ");
            counter++;
        }
        System.out.println();
        System.out.println();
    }

    public static void Task_7() {
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив:");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println("Полученный массив с элементами, которые меньше 6, умноженными на 2:");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) {
                mas[i] = mas[i] * 2;
            }
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void Task_8() {
        int[][] massiv = new int[6][6];
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                if (i + j == massiv.length - 1 || i == j) {
                    massiv[i][j] = 1;
                } else {
                    massiv[i][j] = 0;
                }
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Task_9(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    /*public static void Task_10(int[] arr, int n) {
        System.out.println("Исходный одномерный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Массив, сдвинутый на " + n + " позиции(й) влево:");
        //int temp=arr[0];
        for (int i = arr.length - 1; i > 0; i--) {
            //int temp=arr[0];
            arr[i - 1] = arr[i];
            //arr[arr.length-1]=temp;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }*/

    public static void Task_11() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scan.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Данный год високосный (366 дней)");
                } else {
                    System.out.println("Данный год невисокосный (365 дней)");
                }
            } else {
                System.out.println("Данный год високосный (366 дней)");
            }
        } else {
            System.out.println("Данный год невисокосный (365 дней)");
        }
    }


}
