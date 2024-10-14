/*
Создайте двумерный массив целых чисел. Выведите на консоль сумму
всех элементов массива.
 */
public class Task3 {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int[][] array = new int[rows][columns];

        int value = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = value++;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("Sum of all array elements: " + sum);
    }
}
