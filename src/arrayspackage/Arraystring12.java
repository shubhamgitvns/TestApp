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
public class Arraystring12 {
    public static void main(String[] args) {
        int a[]=new int[6];
        int k = 0;
          System.out.println("Array in element");
        for (int i =0 ; i<6 ; i++){
            Scanner sc = new Scanner (System.in);
            a[i]=sc.nextInt();
        }
        for (int i =0 ; i<6 ; i++){
            k = k+a[i];
        }
        System.out.println("The sum of the Numbers are=  " +k);
        
        
        
        
       
}

}