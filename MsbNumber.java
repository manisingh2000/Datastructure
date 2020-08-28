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
public class MsbNumber {
    static int MsbNumber(int n){
        
        n |= n >> 1; 
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16; 
        n=n+1;//increment n by 1
        return(n>>1);//return value right shift by 1
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(MsbNumber(n));
    }   
}
