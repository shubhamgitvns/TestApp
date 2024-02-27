package hellopackage;

import java.util.Scanner;

public class HelloApp {
    static void Sumof_Set(){
        int arr[]={1,2,3,4,5,6,7,8,9,-3};
        int i,sum=0;
        for(i=0;i<arr.length;i++){
           sum=sum+arr[i];
        }
         System.out.print(sum);
    }

   

    public static void main(String[] args) {
        Sumof_Set();
                

       
    }
}
