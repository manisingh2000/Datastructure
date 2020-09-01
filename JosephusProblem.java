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
public class JosephusProblem {
    static int JosephusProblem(int n) 
    { 
        int position = 0; 
        while (n != 0) { 
            position++; 
            n = n >> 1; 
        } 
        return position; 
    }  
    static int Josephus(int n) 
    { 
        int place = JosephusProblem(n); 
        int x = 1 << (place - 1); 
        n = n ^ x; 
        n = n << 1; 
        n = n | 1;       
        return n; 
    } 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(Josephus(n)); 
    }
    
}
