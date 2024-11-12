/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reverse_anarray;

import java.util.Scanner;
///Write a program in Java programming language that reads a one-dimensional array from the input and prints its reverse
public class Reverse_AnArray {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter size of Array:");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter a number:");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Original Array:");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]+" "); 
        }
        reverse(arr,size);
    }
     static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
}
