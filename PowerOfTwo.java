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
public class PowerOfTwo {
    
    static boolean isPowerofTwo(int n){
        return n !=0 && (n &(n-1))==0;
    }
    
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(isPowerofTwo(n) ? "yes" : "no");
        // TODO code application logic here
    }
}
