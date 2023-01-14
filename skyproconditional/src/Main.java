import java.sql.SQLOutput;
import java.util.function.DoubleFunction;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен" + age + "лет, то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен" + age + "лет, то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = -10;
        if (temperature < -5) {
            System.out.println("Нужно надеть шапку");
        } else {
            System.out.println("Не нужно надевать шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 80;
        if (speed > 60) {
            System.out.println("Придется заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 30;
        if (age >= 2 && age < 6) {
            System.out.println(("Если возраст человека равен") + age + ("то ему нужно входить в детский сад"));
        }
        if (age >= 7 && age < 18) {
            System.out.println(("Если возраст человека равен") + age + ("то ему нужно ходить в школу"));
        }
        if (age > 18 && age < 24) {
            System.out.println(("Если возраст человека равен") + age + ("то его место в универститете"));
        }
        if (age >= 24) {
            System.out.println("А если человеку больше 24, то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 12;
        if (age < 5) {
            System.out.println("Нельзя кататься на аттракционе");
        }
        if (age > 5 && age < 14) {
            System.out.println("Можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age > 14) {
            System.out.println("Можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int place = 5;
        if (place <= 102){
            System.out.println("Место в вагоне есть");
        } else {
            System.out.println("Вагон полностью забит");
        }
        if (place <= 60 && place <= 102) {
            System.out.println("Сидячее место есть");
        } else {
            System.out.println("Сидячего место нет");
        }
        if (place >= 60 && place <= 102) {
            System.out.println("Стоячее место есть");
        } else {
            System.out.println("Стоячего место нет");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int num1 = 456;
        int num2 = 456;
        int num3 = 2023;
        if (num1 > num2)
        {
            System.out.println("Первое число больше второго");
        } else if (num1<num2) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Первое число равно второму числу");
        }
        if (num1 > num3){
            System.out.println("Первое число больше третьего");
        } else if (num1<num3) {
            System.out.println("Первое число меньше третьего");
        } else {
            System.out.println("Первое число равно третьему числу");
        }
        if (num2 > num1){
            System.out.println("Второе число больше первого");
        } else if (num2<num1) {
            System.out.println("Второе число меньше первого");
        } else {
            System.out.println("Второе число равно первому числу");
        }
        if (num2 > num3){
            System.out.println("Второе число больше третьего");
        } else if (num2<num3) {
            System.out.println("Второе число меньше третьего");
        } else {
            System.out.println("Второе число равно третьему числу");
        }
        if (num3 > num1){
            System.out.println("Третье число больше первого");
        } else if (num3<num1) {
            System.out.println("Третье число меньше первого");
        } else {
            System.out.println("Третье число равно первому числу");
        }
        if (num3 > num2){
            System.out.println("Третье число больше второго");
        } else if (num3<num2) {
            System.out.println("Третье число меньше второго");
        } else {
            System.out.println("Третье число равно второму числу");
        }
    }
}

