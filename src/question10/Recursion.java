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
public class Recursion {

    /**
     * @param args the command line arguments
     */
    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int number = 9, result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);

    }
    
}
