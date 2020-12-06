/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapinputs;

import java.util.Scanner;


/**
 *
 * @author Tseegii
 */
public class SwapInputs {

    private static int mySkanner;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner myScanner = new Scanner (System.in);
        int num1, num2;
        int temp;
        System.out.println("Please enter 1st number");
        num1=myScanner.nextInt();
        
        System.out.println("Please enter 2nd number");
        num2=myScanner.nextInt();
        
        System.out.println("num1 stores " + num1 + " and num2 stores " + num2 );
        
        //swap???
        temp=num1;
        num1=num2;
        num2=temp;
        
        System.out.println("AFTER SWAP num1 stores " + num1 + " and num2 stores " + num2 );
         
        
    }


     
}