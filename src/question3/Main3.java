/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author S542308
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int x = 7;  
         long y = x;  //automatically converts the integer type into long type  
        float z = y;  //automatically converts the long type into float type  
        System.out.println("Before conversion, int value "+x);  
        System.out.println("After conversion, long value "+y);  
        System.out.println("After conversion, float value "+z);  
}  

    }

