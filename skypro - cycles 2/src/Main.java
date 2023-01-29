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
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2500000) {
            total = total + total / 100;
            total = total + salary;
            month = month + 1;
            System.out.println(("Месяц") + month + ("сумма накоплений равна") + total + ("рублей"));
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        int j = 1;
        while (number < 10) {
            number = number + number / 100;
            number = number + j;
            System.out.print(number);
        }

        for (int i = 10; i > 0; i--) {
            System.out.print(i);
        }
    }

    public static void task3() {
        System.out.println ("Задача 3");
        int population = 12000000;
        int born = 17;
        int dead = 8;
        int dif = born - dead;
        for (int i = 1; i <= 10; i++){
            population += population * dif/1000;
            System.out.println("Год" + i + "численность населения составляет" + population);}
    }
    public static void task4() {
    System.out.println("Задача 4");
        double sum = 15000;
        int month = 1;
        while (sum < 12_000_000){
            sum += sum * 0.07;
            System.out.println(("Месяц") + month + ("сумма накоплений равна") + sum + ("рублей"));
            month++;
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        double sum = 15000;
        int month = 1;
        while (sum < 12_000_000) {
            sum += sum * 0.07;
            if (month % 6 == 0)
                System.out.println(("Месяц") + month + ("сумма накоплений равна") + sum + ("рублей"));
            month++;
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        double sum = 15000;
        int month = 1;
        while (month < 9 * 12) {
            sum += sum * 0.07;
            if (month % 6 == 0)
                System.out.println(("Месяц") + month + ("сумма накоплений равна") + sum + ("рублей"));
            month++;
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friday = 5;
        do {
            System.out.println("Сегодня пятница" + friday + "-е число. Нужно подготовить отчет");
            friday += 7;
        } while (friday < 31);
    }
    public static void task8() {
        System.out.println("Задача 8");
        int startYear = 2023 - 200;
        int endYear = 2023 + 100;
        int cometYear = 0;
        while (cometYear < endYear) {
                if (cometYear > startYear) {
                    ;
                    System.out.println(cometYear);
                }
                cometYear += 79;
            }
    }
}