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
public class NumberOfOnes {
        
    public static void main(String agrs[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();//input number
    int count=0;
        
    for (count=0; n > 0; count++) {//loop termination
      n &= n - 1;//condition apply
    }
    System.out.println(count);//print no.of counts    
    }    
}
