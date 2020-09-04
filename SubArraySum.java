/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructure;

import java.util.Scanner;

/**
 *
 * @author MANI SINGH
 */
public class SubArraySum {
    int SubArraySum(int array[]) 
    { 
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        int n=array.length;
        int Arraysum; 
        for (int i = 0; i < n; i++) { 
            Arraysum = array[i]; 
            for (int j = i + 1; j <= n; j++) { 
                if (Arraysum == sum) { 
                    int p = j - 1; 
                    System.out.println("Sum found between indexes " +i+ " and " + p);                        
                    return 1; 
                } 
                if (Arraysum > sum || j == n) 
                    break; 
                Arraysum = Arraysum + array[j]; 
            } 
        }  
        System.out.println("No subarray found"); 
        return 0; 
    }  
    public static void main(String[] args) 
    {   Scanner sc=new Scanner(System.in);   
        SubArraySum arraysum = new SubArraySum();
        int n=sc.nextInt();
        int array[] = new int[n];
        for(int i= 0;i<n;i++){
        array[i]=sc.nextInt();
    }
        arraysum.SubArraySum(array); 
    }     
}
