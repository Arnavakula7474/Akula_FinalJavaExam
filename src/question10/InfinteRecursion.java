package question10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542308
 */
public class InfinteRecursion {

    /**
     * @param args the command line arguments
     */
       static void testRecursion(){  
		System.out.println("Testing Recursion ");  
		testRecursion();  
		}  

    public static void main(String[] args) {
        // TODO code application logic here
        testRecursion();  
    }

    
}
