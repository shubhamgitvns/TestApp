/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayspackage;

import java.util.Scanner;

/**
 *
 * @author shubham
 */
public class Copyarry {

    public static void main(String[] args) {
        int a[] = new int[8];
        int b[] = new int[8];
        System.out.println("Enter the arry ");
        for (int i = 0; i < 8; i++) {
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < 8; i++) {
            b[i] = a[i];
        }
        System.out.println("The new elemnt in Array is ");
        for (int i = 0; i < 8; i++) {
            System.out.println(b[i]);
        }

    }

}
