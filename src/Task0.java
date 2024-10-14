/*
Создать трехмерный массив из целых чисел.
С помощью циклов "пройти" по всему массиву и увеличить каждый
элемент на заданное число. Пусть число, на которое будет
увеличиваться каждый элемент, задается из консоли.

 */

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to increment the array elements: ");
        int num = scanner.nextInt();

        int xSize = 3;
        int ySize = 3;
        int zSize = 3;

        int[][][] array = new int[xSize][ySize][zSize];

        int value = 0;

        for(int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                for (int n = 0; n < zSize; n++) {
                    array[i][j][n] = value++;
                }
            }
        }

        for(int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                for (int n = 0; n < zSize; n++) {
                    array[i][j][n] += num;
                }
            }
        }

        for(int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                for (int n = 0; n < zSize; n++) {
                    System.out.print(array[i][j][n] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}