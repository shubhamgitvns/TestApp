package hellopackage;

import java.util.Scanner;

public class HelloApp {

    static void Decimal_Binary() {
        int num = 10, i = 0;
        int binaryNum[] = new int[1000];
        System.out.println("Decimal is: " + num);
        System.out.print("Binary is: ");
        while (num > 0) {

            binaryNum[i] = num % 2;
            num = num / 2;

            i++;

        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j]);
        }

    }

    static void Decimal_Octal() {
        int num = 19, i = 0;
        int octalNum[] = new int[1000];
        System.out.println("Decimal is: " + num);
        System.out.print("Octal is: ");
        while (num > 0) {
            octalNum[i] = num % 8;
            num = num / 8;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(octalNum[j]);
        }
    }

    static void Decimal_Hexa() {
        int num = 0, i = 0;
        int hexaNum[] = new int[1000];
        System.out.println("Decimal is: " + num);
        System.out.print("Hexadecimal is: ");
        if (num == 0) {
            System.out.print("0");
        }
        while (num > 0) {
            hexaNum[i] = num % 16;
            num = num / 16;
            i++;

        }
        for (int j = i - 1; j >= 0; j--) {
            //System.out.print(hexaNum[j]);
            if (hexaNum[j] == 10) {
                System.out.println("A");

            } else if (hexaNum[j] == 11) {
                System.out.println("B");

            } else if (hexaNum[j] == 12) {
                System.out.println("C");

            } else if (hexaNum[j] == 13) {
                System.out.println("D");

            } else if (hexaNum[j] == 14) {
                System.out.println("E");

            } else if (hexaNum[j] == 15) {
                System.out.println("F");

            } else {
                System.out.print(hexaNum[j]);
            }

        }

    }

    static void Binary_Decimal() {
        int num = 1011;
        int dec_value = 0;

        int base = 1;

        while (num > 0) {
            int last_digit = num % 10;
            num = num / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }
        System.out.print(dec_value);

    }
    
    static void Octal_Decimal() {
        int num = 70;
        int dec_value = 0;

        int base = 1;

        while (num > 0) {
            int last_digit = num % 10;
            num = num / 10;

            dec_value += last_digit * base;

            base = base * 8;
        }
        System.out.print(dec_value);

    }
    
    

    public static void main(String[] args) {
        //Decimal_Binary();
        //Decimal_Octal();
        //Decimal_Hexa();
        Octal_Decimal();
        System.out.println("");

    }
}
