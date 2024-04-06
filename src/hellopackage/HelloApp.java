package hellopackage;

import java.util.Arrays;
import java.util.Scanner;

public class HelloApp {

    static void insertionSort(int[] a) {

        for (int i = 0; i <= a.length - 2; i++) {
            if (a[i] <= a[i + 1]) {
                continue;
            }
            int t = a[i + 1];
            int j = i + 1;
            while (j >= 1 && a[j - 1] > t) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = t;
        }

    }

    static int multiplication(int a, int b) {
        int mult = a * b;
        return mult;

    }

    static void evenOdd(int a) {

        if (a % 2 != 0) {
            System.out.print("Odd ");
        } else {
            System.out.print("Even ");
        }
    }

    static double average(int a, int b, int c) {
        int sum = a + b + c;
        double avg = sum / 3.0;
        return avg;

    }

    static void factorial(int num) {
        int fact = 1;
        if (num == 0) {
            System.out.print("Number is Zero");
        }
        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.print(fact);

    }

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int i;
        int temp;
            temp=a[0];
            a[0]=a[3];
            a[3]=temp;
        for(i=0;i<a.length;i++){
            
             System.out.print(a[i]+ ",");

           
        }
       
        
    }

}
