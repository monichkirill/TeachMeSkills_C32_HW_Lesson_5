/*
Напишите программу для умножения двух матриц.
Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
Ожидаемый результат: 1 2 3 1 1 1 0 0 0

 */
public class Task2 {
    public static void main(String[] args) {
        int[][] array1 = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}};
        int[][] array2 = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}};

        int rows1 = array1.length;
        int cols1 = array1[0].length;
        int cols2 = array2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int n = 0; n < cols1; n++) {
                    result[i][j] += array1[i][n] * array2[n][j];
                }
            }
        }

        System.out.println("Result: ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
