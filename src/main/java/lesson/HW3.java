package lesson;

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        arrayMultiply();
        arrayDiagonal();
        printArrayInConsole(returnArray(4, 6));
    }

    // метод 1
    public static int[] invertArray(int[] array) {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if (n == 1) {
                i = 0;
            } else if (n == 0) {
                i = 1;
            }
        }
        return arr;
    }

    // метод 2
    public static int[] arrayFill(int[] array) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        return arr;
    }

    // метод 3
    public static int[] arrayMultiply() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int m;

        for (int i = 0; i < arr.length; i++) {
            m = arr[i];
            arr[i] = m < 6 ? m * 2 : m;

        }
        System.out.println(Arrays.toString(arr));
        return arr;


    }

    // метод 4
    public static int[][] arrayDiagonal() {
        int a = 6;
        int[][] arr = new int[a][a];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; a = arr[i].length, j++, a--) {
                if (i == j || i == a - j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;

                }

            }

        }
        System.out.println(Arrays.deepToString(arr).replace("], ", "]\n"));

        return arr;

    }

    // метод 5
    public static int[] returnArray(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;

    }

    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }


}














