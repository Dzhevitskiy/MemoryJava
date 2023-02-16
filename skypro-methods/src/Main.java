public class Main {
    public static void main(String[] args) {
        printLeapYear(2020);
        printAppType(0, 2014);
        int days = countDeliveryDays(29);
        if (days > 0) {
            System.out.println("Доставки займет " + days);
        }
    }
    public static void printLeapYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "год - високосный год");
        } else {
            System.out.println(year + "год - невисокосный год");
        }
    }
    public static void printAppType (int osType, int deviceYear) {
        String osName;
        if (osType == 0) {
            osName = "iOS";
        } else {
            osName = "Android";
        }
        String appType;
        if (osType == 0) {
            appType = "обычную";
        } else {
            appType = "облегченную";
        }
        System.out.println("Установите " + appType + " версию приложения для " + osName);
    }
    public static int countDeliveryDays (int deliveryDistance) {
         int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        if (deliveryDistance > 100) {
            return -1;
        }
        return days;
    }
}