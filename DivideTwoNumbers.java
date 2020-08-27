/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructure;

import static com.sun.javafx.fxml.expression.Expression.divide;
import java.util.Scanner;

/**
 *
 * @author MANI SINGH
 */
public class DivideTwoNumbers {
    static int DivideTwoNumbers(long dividend , long divisor){
        long n=((dividend < 0) ^ (divisor < 0)) ? -1 : 1; //condition given 
        //convert both in positive
        dividend = Math.abs(dividend);  
        divisor = Math.abs(divisor);
        long quotient=0;//initialize the quotient
        long temp =0;
        for(int i= (int) dividend;i>=divisor;--i){//loop test for the highest
            if(temp+(divisor<<i) <=dividend){//check the condition
                temp += divisor<<1;//update temp
                quotient |= 1 << i;//update quo
            }
        }
        return  (int) (n*quotient);//return statement
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int y =sc.nextInt();
        System.out.println(divide(x,y));//division
    }   
}
