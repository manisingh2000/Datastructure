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
public class FibonacciSeries {
    public static int fib(int n, int sol[] ){        
        if((n==0) || (n==1))
            return n;
        if(sol[n]!=0)
            return sol[n];       
        else{            
            int fn =fib(n-1,sol)+fib(n-2,sol);
            sol[n]= fn;
            return fn;
        }
    }    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sol[] = new int[n+1];
        int x=fib(n,sol);        
        System.out.println(x);
    }
}
    

