/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author shubham
 */
public class Arrayreverse {
    public static void main(String[] args) {
        
    
   
    
    int a []= new int[4];
    System.out.println("Enter the number");
    a[1]= 10;
    for (int i =0; i<4;i++){
        Scanner sc = new Scanner(System.in);
        a[i]= sc.nextInt();
    }
    
 System.out.println("The number in reverse are");
    for (int i = 3; i>=0 ; i--){
        
        System.out.println(a[i]);
    }
    
   
    
    
    }
}

