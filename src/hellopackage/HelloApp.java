package hellopackage;

import java.util.Scanner;

public class HelloApp {

    
    static void Sumof_Set() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, -3};
        int i, sum = 0;
        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }
    

    static void Fizz_Buzz() {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int i;
        String temp = "";
        System.out.println("FizzBuzz Twist numbers:");

        for (i = 0; i < a.length; i++) {

            if (a[i] % 3 == 0 && a[i] % 5 != 0) {

                System.out.print("FiZZ" + ",");
            }

            if (a[i] % 5 == 0 && a[i] % 3 != 0) {

                System.out.print("Buzz" + ",");
            }
            if (a[i] % 3 == 0 && a[i] % 5 == 0) {

                System.out.print("FizzBuzz");
            }
            if (a[i] % 3 != 0 && a[i] % 5 != 0) {
                System.out.print(a[i] + ",");
            }
        }
    }

    

    static void Reverse_String() {

        String str_a = "apple", str_b = "";
        char ch;
        int i;

        System.out.print("Original word: ");
        System.out.println(str_a);

        for (i = 0; i < str_a.length(); i++) {
            ch = str_a.charAt(i);
            str_b = ch + str_b;
        }
        System.out.println("Reversed word: " + str_b);
    }
    

    static void Sumof_Digit() {
        int digit,
                rem=0,
                sum = 0,
                result=0;
                long number = 9;

        while (number > 0) {
            digit =(int) (number % 10);
            
            System.out.print(Double.MAX_VALUE);
            
            number = number / 10;
            sum = sum + digit;
            if(sum >10){
                Sumof_Digit();
              
            }
            if(sum<10){
                //System.out.print(sum);
                return;
            }
          
        }
    }
    
    static void Factorial(){
        int a=5;
        int i,fact=1;
        for(i=1;i<=a;i++){
            fact=i*fact;
            
           
        }
         System.out.print(fact);
       
    }
    
    static void Patern(){
        int i,j,row=5;
        for(i=0;i<row;i++){
            for(j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        //Sumof_Digit();
        //Fizz_Buzz();
        // Reverse_String();
        Factorial();
        //Patern();

    }
}
