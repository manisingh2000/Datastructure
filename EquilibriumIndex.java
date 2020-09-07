/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author MANI SINGH
 */
public class EquilibriumIndex {
    public static void EquilibriumIndex(int[] arr){
        int n=arr.length;
        int total = IntStream.of(arr).sum();
        int right = 0;
        List<Integer> Index = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--){
            if (right == total - (arr[i] + right)) {
                Index.add(i);                
            }
            right += arr[i];  
        } 
        System.out.println("Equilibrium at Index " + Index);       
    }
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i = n - 1; i >= 0; i--){
            arr[i]=sc.nextInt();
    }
        EquilibriumIndex(arr);
    }
    
}
