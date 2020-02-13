/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivelenearsearch;

import java.util.Scanner;

/**
 *
 * @author Katwalusha
 */
public class RecursiveLenearSearch {

    static int arr[] = {12, 34, 54, 2, 3}; 
       
     /* Recursive Method to search x in arr[l..r] */
     static int recSearch(int arr[], int l, int r, int x) 
     { 
          if (r < l) 
             return -1; 
          if (arr[l] == x) 
             return l; 
          if (arr[r] == x) 
             return r; 
          return recSearch(arr, l+1, r-1, x); 
     } 
    
    public static void main(String[] args) {
    
 
     Scanner in = new Scanner(System.in);
 
     System.out.println("Enter a number to search: ");
     int inputN = in.nextInt();
    
        int index = recSearch(arr, 0, arr.length-1, inputN); 
        if (index != -1) 
           System.out.println("Element " + inputN + " is present at index " +  
                                                    index); 
        else
            System.out.println("Element " + inputN + " is not present"); 
        } 
    }
    

