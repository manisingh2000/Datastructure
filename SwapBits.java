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
public class SwapBits {
    static int SwapBits(int n){
        int evenBits = n & 0xAAAAAAAA; //doing bitwise and of n with 0xAAAAAAAA.
        int oddBits = n & 0x55555555;  //doing bitwise and of n with 0x55555555
        evenBits >>= 1;//right shift of all even bits by 1
        oddBits <<= 1;  //left shift of all odd bits by 1
        
        return(evenBits | oddBits);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(SwapBits(n));
    
    }
    
}
