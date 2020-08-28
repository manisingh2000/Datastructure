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
public class SubsetOfASet
{
    static void Subsets(int n[])
    {
        int size=n.length;
        for(int i=0;i<(1<<size);i++){            
            System.out.print("{");           
            for(int j=0;j<size;j++){              
                if((i & (1<<j)) > 0){
                    System.out.print(n[j]+ " ");
               }  
            }
            System.out.print("}");
        }     
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int n[] =new int[size];
        for(int i= 0;i<size;i++){
        n[i]=sc.nextInt();
    }
        Subsets(n);
    }
}
