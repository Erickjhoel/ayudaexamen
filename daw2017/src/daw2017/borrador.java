package daw2017;

import java.util.Random;
import java.util.Scanner;

public class borrador {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int max;
        boolean primo;
        System.out.println("ESCRIBA N:");
        max = s.nextInt();
        for (int i = 1; i < max; i++) {
            primo = true;

            for (int j = 2; j < 10; j++) {
                if (i % j != 0) {
                    primo = false;
                }
                if (primo) {
                    System.out.println(i);
                }
            }
        }

    }
}
