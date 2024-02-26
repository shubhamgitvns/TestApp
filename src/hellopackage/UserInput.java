/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellopackage;

import java.util.Scanner;

/**no n array 3,3,1,4.... location 2 ....new no in array .... 3,3,5,6: 
 * we are making these program :
 *
 * @author shubham
 */
public class UserInput {
    public static void main(String[] args) {
        
    
   System.out.println("Enter the size");
   Scanner sc = new Scanner(System.in);
   int size = sc.nextInt();
        int a []= new int[size+1];
   System.out.println("Enter the location");
   int loc = sc.nextInt();
  System.out.println("Enter the number");
  int number = sc.nextInt();
  System.out.println("Enter the number in Array");
  for(int i=0;i<size ; i++){
      a[i]= sc.nextInt();
  }
         
 
 for (int i=size ; i>loc ; i--){
     a[i]=a[i-1];
     
 }
  a[loc]=number;
  size++;
  System.out.println("The new element in array");
  for(int i=0 ; i<size;i++){
      System.out.println(a[i]);
  }
}
}