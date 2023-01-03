public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println ("Общий вес боксеров" + totalWeight);
        var totalWeight1 = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе боксеров" + totalWeight1 + "кг!");
        var totalWeight2 = (boxer2Weight % boxer1Weight);
        System.out.println("Разница в весе" + totalWeight2 + "кг!");

        var totalHours = 640;
        var totalHoursforone = 8;
        var totalStaff = (totalHours / totalHoursforone);
        System.out.println("Всего работников в компании" + totalStaff + "человек!");
        var totalStaff1 = 174;
        var totalHoursforone1 = (totalHours / totalStaff1);
        System.out.println ("Если в компании работает 174 человека,то всего" + totalHoursforone1 + "часов работы может поделено между сотрудниками!");
    }
}