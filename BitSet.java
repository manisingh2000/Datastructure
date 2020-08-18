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
public class BitSet {
    static void isKthBitSet(int n,int k){
        if (((n >> (k - 1)) & 1) == 1){
            System.out.println("Set");
        }
        else{
            System.out.println("Not Set");     
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Scanner scan =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        isKthBitSet(n, k);
              
    }
    
}
