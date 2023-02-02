import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        int oneNums = nums[0];
        int twoNums = nums[1];
        int threeNums = nums[2];
        System.out.println(oneNums);
        System.out.println(twoNums);
        System.out.println(threeNums);

        double[] numbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        long[] arr1 = new long[365];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) ;
            {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != nums.length - 1) ;
            {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) ;
            {
                System.out.print(",");
            }
        }
        System.out.println();



        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) ;
            {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != nums.length - 1) ;
            {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) ;
            {
                System.out.print(",");
            }
        }
        System.out.println();


        for (int i = 0; i < nums.length; i++) {
           if (nums[i] % 2 == 1) {
               nums[i] = nums[i] + 1;
           }
            System.out.println(Arrays.toString(nums));
        }
    }
}
