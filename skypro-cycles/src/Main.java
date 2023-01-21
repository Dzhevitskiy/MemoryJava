public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i < 11; i++) {
            System.out.println("Итерация цикла" + i);
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println("Итерация цикла" + i);
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i < 18; i = i + 2) {
            System.out.println("Интерация цикла" + i);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i > -11; i--) {
            System.out.println("Интерация цикла" + i);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + "год является високсным");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println("Интерация цикла" + i);
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        for (int i = 2; i < 513; i = i * 2) {
            System.out.println("Интерация цикла" + i);
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + salary;
            System.out.println ("Месяц" + i + "сумма накоплений равна" + total + "рублей");
        }
    }
    public static void task9 () {
        System.out.println("Задача 9");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц" + i + "сумма накоплений равна" + total + "рублей");
        }
    }
    public static void task10 () {
        System.out.println("Задача 10");
        for (int i = 1; i < 2 ; i = i * 2) {
            System.out.println(2 * i);
        }
        for (int i = 2; i < 3 ; i = i * 2) {
            System.out.println(2 * i);
        }
        for (int i = 3; i < 4 ; i = i * 2) {
            System.out.println(2 * i);
        }
        for (int i = 4; i < 5 ; i = i * 2) {
            System.out.println(2 * i);
        }
        for (int i = 5; i < 6 ; i = i * 2) {
            System.out.println(2 * i);
        }
        for (int i = 6; i < 7 ; i = i * 2) {
            System.out.println(2 * i);
        }
        for (int i = 7; i < 8 ; i = i * 2) {
            System.out.println(2 * i);
        }
        for (int i = 8; i < 9 ; i = i * 2) {
            System.out.println(2 * i);
        }
        for (int i = 9; i < 10; i = i * 2) {
            System.out.println(2 * i);
        }
        for (int i = 10; i < 11 ; i = i * 2) {
            System.out.println(2 * i);
        }
    }
}