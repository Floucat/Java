public class HW2 {

    public static void main(String[] args) {
        boolean c = sumWithin(2, 10);
        System.out.println(c);
        numberSign(4);
        System.out.println(truthCheck(-3));
        linePrinting("WoW", 8);
        System.out.println(leapYear(2021));

    }

    public static boolean sumWithin(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void numberSign(int a) {
        System.out.println(a >= 0 ? "Положительное" : "Отрицательное");

    }

    public static boolean truthCheck(int a) {
        return a < 0;
    }

    public static void linePrinting(String line, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println(line);
        }

    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
}