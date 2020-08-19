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

/*pseudocode
for(int i=n;i>= 1;i--)
       if((i&(i-1))==0)
            x=i
return x
*/
//code
public class HighestSignificantBit {
    static int HighestSignificantBit(int n){
        int x=0;
        for(int i=n;i>= 1;i--){//loop initialization
            if((i&(i-1))==0){//if i is a power of 2
                x=i;//store i in x
                break;          
            }            
        }
        return x;       //return store value
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(HighestSignificantBit(n));//execute the loop
    }
}
