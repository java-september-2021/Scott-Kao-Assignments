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

    }
}