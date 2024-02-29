package hellopackage;

import java.util.Scanner;

public class HelloApp {

    static void Max_Factorof_Twoint() {
        int num = 10;
        int num_b = 15;
        int temp = 0, max = 0;
        //System.out.print("Deviser :");
        for (int i = 2; i < num + num_b; i++) {
            if (num % i == 0 || num_b % i == 0) {
                temp = i;
                //System.out.print(temp + ","); 
                if (num % temp == 0 && num_b % temp == 0) {
                    max = temp;
                    System.out.println("");
                    System.out.print("Max=" + max + ",");

                }

            }

        }
    }

    static void PrimeNumber() {
        int num = 4, count = 0, i;
        if (num <= 1) {
            System.out.print("This number is not prim");
            return;
        }
        for (i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println(num + " The number is not prime");
        } else {
            System.out.println(num + " The number is prime");
        }
    }

    static void LargePower() {
        int x = 5,
                n = 4,
                sqt = 1;
        if (x == 1) {
            System.out.print(x);
            return;
        }
        for (int i = 1; i <= n; i++) {
            sqt = sqt * x;

        }
        System.out.print(sqt);

    }
    
    static void FebonacciSerise(){
        int n=9,fib=0,n1=0,n2=1,n3;
         System.out.print(n1+","+n2);
        for(int i=1;i<n;i++){
            n3=n1+n2;
             System.out.print(","+n3);
            n1=n2;
            n2=n3;
           
        }
    }

    public static void main(String[] args) {

        FebonacciSerise();
        System.out.println("");

    }
}
