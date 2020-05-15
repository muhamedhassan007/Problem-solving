/*
    * we have an array and target 
    *we need to check if there are any elements in the array there sum equal to
       the target then return they indexes
    *EXAMPLE:
        array[3,7,10,8,9], target =10
        the result =1,0
 */
package twosum;


public class client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        twosum obj=new twosum();
        
           int []ori={3,7,10,8,9};
       
       int[] temp= obj.twoSum(ori,10);
        for (int i = 0; i < temp.length; i++) {
                System.out.println(temp[i]);
            
        }
       
        
       
        
    }}
    

