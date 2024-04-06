package hellopackage;

import java.util.Arrays;
import java.util.Scanner;

public class HelloApp {

    static void array_mult() {
        int a[] = {1, 2, 3, 4, 5, 5};
        int sum = 1;
        for (int i = 0; i < a.length; i++) {

            sum = sum * a[i];

        }
        System.out.print(sum);
    }

    static void LCM() {

        int a = 5, b = 10, c = 15;
        int i;
        int count = 0;
        int n = a * b * c;
        int min = 0;
        if (a <= b && a <= c) {
            min = a;
        }
        if (b <= c) {
            min = b;
        } else {
            min = c;
        }
        for (i = min; i <= n; i = i + min) {

            count++;
            if (i % a == 0 && i % b == 0 && i % c == 0) {

                System.out.printf("LCM = %s, Count=%s\n", i, count);
                break;
            }

        }
    }

    public static void main(String[] args) {

        LCM();
//        array_mult();

    }

}
