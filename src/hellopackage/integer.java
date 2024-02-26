/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellopackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author shubham
 */
class integer {

    public static void main(String[] args) {
        String[] names = new String[5];
        System.out.println("Enter the character through ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= names.length - 1; i++) {

            names[i] = sc.nextLine();

        }
        System.out.println(Arrays.toString(names));;

    }

}
