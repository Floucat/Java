package lesson;

import java.util.Random;

public class HW1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    // method 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // method 2
    public static void checkSumSign() {
        int a = 1;
        int b = 3;
        int c = (a + b);

        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    // method 3
    public static void printColor() {
        //int value = (int) (System.currentTimeMillis() %(Math.random()*200));
        int value = new Random(System.currentTimeMillis()).nextInt(400) - 200;
        System.out.println(value);
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    // method 4
     public static void compareNumbers() {
        int f = 3;
        int g = 20;

        if (f >= g) {
            System.out.println("f >= g");
        } else {
            System.out.println("f < g");
        }

    }


}

