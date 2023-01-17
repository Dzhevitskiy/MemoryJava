public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        int iOS = 0;
        int android = 1;
        if (clientOS == iOS) {
            System.out.println("Установите версию для iOS по ссылке");
        }
        if (clientOS == android) {
            System.out.println("Установите версию для android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int iOS = 0;
        int android = 1;
        int clientDeviceYear = 2013;
        if (clientOS == iOS && (clientDeviceYear <= 2015 || clientDeviceYear >= 2015)) {
            System.out.println("Установите версию для iOS по ссылке");
        } else if (clientDeviceYear <= 2015) {
            System.out.println("Установите приложение");
        } else {
            System.out.println("Установите облегченную версию");
        }
        if (clientOS == android && (clientDeviceYear <= 2015 || clientDeviceYear >= 2015)) {
            System.out.println("Установите версию для android по ссылке");
        } else if (clientDeviceYear <= 2015) {
            System.out.println("Устновите приложение");
        } else {
            System.out.println("Установите облегченную версию");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 1200;
        if (year % 4 == 0) {
            if ((year % 100 == 0) || (year % 400 == 0)) {
                System.out.println("Год високосный");
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 114;
        boolean oneDay = (deliveryDistance <= 20);
        if (oneDay) {
            System.out.println("Потребуется 1 день" + deliveryDistance + "км");
        } else {
            boolean twoDays = (deliveryDistance > 20) && (deliveryDistance <= 60);
            if (twoDays) {
                System.out.println("Потребуется 2 дня" + deliveryDistance + "км");
            } else {
                boolean threeDays = (deliveryDistance > 60) && (deliveryDistance <= 100);
                if (threeDays) {
                    System.out.println("Потребуется 3 дня" + deliveryDistance + "км");
                } else {
                    System.out.println("Доставка не предусмотрена" + deliveryDistance + "км");
                }
            }
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 11;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
