import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println(value);
        
        Integer value2 = 33;
        changeValue(value2);
        System.out.println(value2);

        Integer[] arr = new Integer[] {3, 4};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));

        changeValue2(arr);
        System.out.println(Arrays.toString(arr));

        var person = new Person("Lyapis" , "Trubetskoy");
        person.changePerson(person);
        System.out.println(person);

        person.changePerson2(person);
        System.out.println(person);
    }
    private static void changeValue (int value) {
        value = 22;
    }
    private static void changeValue (Integer value) {
        value = 22;
    }
    private static void changeValue (Integer[] arr) {
        arr = new Integer[] {1, 2};
    }
    private static void changeValue2(Integer[] arr) {
        arr[0] = 99;
    }
}