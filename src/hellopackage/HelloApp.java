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

    static void count_Digit() {
        int number = 12377;
        int count = 0;

        while (number > 0) {
            number /= 10;
            count++;
        }

        System.out.println(count);
    }

    static void decimal_Hexa() {
        int num = 1243, i = 0;
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
    
    static void matrix_Mult(){
        int a[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int b[][] ={{1,1,1}, {2,2,2}, {3,3,3}};
        int c[][]=new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j]=0;
                for(int k=0; k<3; k++){
                    c[i][j]+=a[i][k]* b[i][k];
                }
                System.out.print(c[i][j] + " ");
                
            }
            
             System.out.println();
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        
       matrix_Mult();
       

    }

}
