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
public class Main4 {
public static void main(String args[]) 
{ 
double d = 166.66; 
//converting double data type into long data type 
long l = (long)d; 
//converting long data type into int data type 
int i = (int)l; 
System.out.println("Before conversion: "+d); 
//fractional part lost 
System.out.println("After conversion into long type: "+l); 
//fractional part lost 
System.out.println("After conversion into int type: "+i); 
} 
}
