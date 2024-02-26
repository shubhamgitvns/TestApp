package hellopackage;

import java.util.Scanner;

public class HelloApp {

    static void Check_Poss_Nig() {
        int a[] = {1, 2, -3, 4, -5, 6};
        int i, pos = 0, neg = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                pos++;
            }
        }
        System.out.println("positive ineger= " + pos);
        System.out.println("negative ineger= " + (a.length - pos));

    }

    static void Check_Pass() {
        int pass = 0, fail = 0;
        Scanner Obj = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number:");
            int num = Obj.nextInt();
            if (num < 0) {
                break;
            }
            if (num < 40) {
                fail++;
            } else {
                pass++;
            }
        }
        System.out.println("Pass=" + pass);
        System.out.println("fail=" + fail);

    }

    static void Exchange() {
        int arr[] = {1,2,3,4,5};
        int i, n = 1;

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        for (i = 0; i < n; i++) {
            int j, last;
            last = arr[arr.length - 1];

            for (j = arr.length - 1; j > 0; j--) {

                arr[j] = arr[j - 1];
            }

            arr[0] = last;
        }

        System.out.println();

        System.out.println("Array after right rotation: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {

        // Check_Poss_Nig();
        Exchange();

    }
}
