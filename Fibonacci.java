/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

import java.util.Scanner;

/**
 *
 * @author MANI SINGH
 */
public class Fibonacci {
    public static long fib(long n){
        if((n==0) || (n==1)){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);     
        long a=sc.nextLong();
        for(int i=0;i<a;i++){
        System.out.println(fib(i));
    }
}
}
