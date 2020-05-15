/*
 *Dynamic connectivity is a data structure that dynamically maintains the information about thee connected components of graph
 * EXAMPLE:
    * at first we init array of length 10
    * we connect index 3 and 8
    * if we check that index 3 and 8 is connect or not, the result will be true 
 
 */
package Dynamicconnectivity;

import java.util.Scanner;


public class client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("length of array: ");
        int n= sn.nextInt();
////////////////////////////////////////////////////////////////        
       quickfind dynv1=new quickfind(n);
       dynv1.union(3,8);
       
       
      System.out.println(dynv1.connect(3,8));
      
/////////////////////////////////////////////////////////////////      
  
      
      
      
    }
    
    
}
