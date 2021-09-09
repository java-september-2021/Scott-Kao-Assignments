import java.util.ArrayList;
public class Basics {
    public static void main(String[] args) {
        // Print 1 - 255
        for (int i = 0; i < 256; i++) {
            System.out.println(i);
        }
        // Print Odd numbers 1 - 255
        for (int i = 0; i < 256; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        // Print Sum of 255
        Integer sum = 0;
        for(int i = 0; i < 256; i++) {
            sum += i;
        }
        System.out.println(sum);
        // iterate Array
        int[] myArray = {1,3,5,7,9,13};
        for(int i = 0; i <= myArray.length; i++) {
            System.out.println(i);
        }
        // Max Value of Array
        int[] arr = {-3,-5,-7, 10};
        int arrayMax = arr[0];
        for(int i = 0; i <= arr.length; i++) {
            try {
                if (arr[i] > arrayMax) {
                    arrayMax = arr[i];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
        System.out.println(arrayMax);
        // Array of Odd Numbers 1 - 255
        int[] oddArray = {0};
        for (int i = 0; i < 256; i++) {
            if (i % 2 != 0) {
                oddArray += i;
            }
        }
        System.out.println(oddArray);
    }

    // Return Sum of 255
    public static int sum() {
        Integer sum = 0;
        for(int i = 0; i < 256; i++) {
            sum += i;
        }
        return sum;
    }

}