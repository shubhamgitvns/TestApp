/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, c .............00000099()()()()()()()()                 hoose Tools | Templates
 * and open the template in the editor.
 */
package arrayspackage;

import java.util.Scanner;

/**
 *
 * @author shubham
 */
public class SortinginArray {
    public static void main(String[] args) {
        int a []= new int [4];
        int i ;
        System.out.println("ENTER THE NUMBER ");
        for (i = 0 ; i<4; i++){
         Scanner sc = new Scanner (System.in);
            a[i]=sc.nextInt();
        }
            for (i=0 ; i<4 ; i++){
                for (int j = i+1 ; j<4 ; j++)
                {
                    if (a[i]>a[j]){
                        int temp= a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                    
                }
            }
            System.out.println("The numbers   shortest are :");
            for (i=0;i<4;i++){
                System.out.println(a[i]);
                      
                    
                }
            }
        {
                
        }
       
            
    }
    

