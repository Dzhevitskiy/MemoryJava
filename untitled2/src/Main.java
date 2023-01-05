public class Main {
    public static void main(String[] args) {

        byte tea = 3;
        int coffee = 100;
        short salt = 5;
        long spoon = 10000;
        float sugar = 1;
        double sugarWeight = 45.50;

        double a = 27.12;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -127;
        short g = 27897;
        byte h = 67;

        byte lydmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paper = 480;
        int totalStudents = (lydmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("Всего учеников" + totalStudents);
        byte oneSheet = (byte) (paper / totalStudents);
        System.out.println("На каждого ученика рассчитано" + oneSheet + "листов бумаги!");

        byte oneMinute = 8;
        byte twentyMinute = 20;
        short bottleTwentyMinute = (short) (oneMinute*twentyMinute);
        System.out.println("Бутылок за 20 минут будет" + bottleTwentyMinute);
        short oneDay = 1440;
        short bottleOneDay = (short) (oneMinute*oneDay);
        System.out.println("Бутылок за сутки будет" + bottleOneDay);
        short threeDay = 4320;
        int bottleThreeDay = (int) (oneMinute * threeDay);
        System.out.println("Бутылок за три дня будет" + bottleThreeDay);
        int Month = 43200;
        int bottleMonth = (int) (oneMinute * Month);
        System.out.println("Бутылок за меясц будет" + bottleMonth);

        byte totalCans = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte office = (byte) (totalCans/(whitePaint+brownPaint));
        System.out.println("Классов в школе" + office);
        byte cansWhite = (byte) (office * whitePaint);
        byte cansBrown = (byte) (office * brownPaint);
        System.out.println("В школе, где" + office + "классов, нужно" + cansWhite + "банок белой краски и" + cansBrown + "банок коричневой краски");

        byte banans = 5;
        byte milk = 105;
        byte iceCream = 2;
        byte egg = 4;
        byte bananGram = 80;
        byte milkGram = 105;
        byte iceCreamGram = 100;
        byte eggGram = 70;
        short banans1 = (short) (banans*bananGram);
        System.out.println("Бананов в граммах" + banans1);
        short milk1 = (short) (milk + milkGram);
        System.out.println("Молока в граммах" + milk1);
        short iceCream1 = (short) (iceCream * iceCreamGram);
        System.out.println("Мороженого в граммах" + iceCream1);
        short egg1 = (short) (egg * eggGram);
        System.out.println("Яиц в граммах" + egg1);
        short Gram = (short) (banans1 + milk1 + iceCream1 + egg1);
        System.out.println("Общее количество граммов" + Gram);
        short kiloGram = 1000;
        float kiloGram1 = (float) (Gram / kiloGram);
        System.out.println("Общее количество в килограммах" + kiloGram1);

        short weightLose = 7000;
        short weight1 = 250;
        short weight2 = 500;
        byte days1 = (byte) (weightLose / weight1);
        System.out.println("Дней нужно при скидывании по 250 грамм" + days1);
        byte days2 = (byte) (weightLose / weight2);
        System.out.println("Дней нужно при скидывании по 500 грамм" + days2);
        byte averageNumberOfDays = (byte) ((days2 + days1) / 2);
        System.out.println("Среднее количество дней для похудения" + averageNumberOfDays);

        int Masha = 67760;
        byte percent = 10;
        int Masha1 = (Masha / percent);
        int Masha2 = (Masha1 + Masha);
        System.out.println("Маша теперь получает" + Masha2 + "рублей. Годовой доход вырос на" + Masha1 + "рублей");
        int Denis = 83690;
        int Denis1 = (Denis / percent);
        int Denis2 = (Denis1 + Denis);
        System.out.println("Денис теперь получает" + Denis2 + "рублей. Годовой доход вырос на" + Denis1 + "рублей");
        int Kristina = 76230;
        int Kristina1 = (Kristina / percent);
        int Kristina2 = (Kristina1 + Kristina);
        System.out.println("Кристина теперь получает" + Kristina2 + "рублей. Годовой доход вырос на" + Kristina1 + "рублей");




    }
}