/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayspackage;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author shubham
 */
public class Arraysortinginswitch {

    public static void main(String[] args) {

        Integer a[] = new Integer[4];
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            a[i] = sc.nextInt();
        }
        System.out.println("for sorting in press 1 ,press 2 for reverse sort");
        int press = sc.nextInt();
        switch (press) {
            case 1:
                Arrays.sort(a);
                System.out.println(Arrays.toString(a));
                break;

            case 2:
                System.out.println("THe Reverse short");
                Arrays.sort(a, new ReverseSort());
                System.out.println(Arrays.toString(a));
                break;
            default:
                System.out.println("The number you enter is wrong press right");
                break;
        }

    }
}
