/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2, 3,4,5 ,location 2, we enter 100 now new is 2 ,100, 3, 4,5
 *
 * @author shubham
 */
public class Array {

    static boolean compare;

    public static void main(String[] args) {
        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println(Arrays.toString(a));

        System.out.println("Enter the location");
        int location = sc.nextInt();
        System.out.println("Enter the numberthat you want in new location");
        int number = sc.nextInt();
        a[location] = number;
        System.out.println(Arrays.toString(a));

    }

    static boolean toString(int[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
