/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twosum;





/**
 *
 * @author HP
 */
public class twosum {
     public int[] twoSum(int[] nums, int target) {
         int ind[]=new int[2];
         int i=0;
         
    
         
         for ( i = 0; i < nums.length; i++) {
             int res1=target-nums[i];
             
             for (int j = 0; j < nums.length; j++) {
                 if(i==j){
                     continue;
                     
                 }
                 else if(nums[j]==res1){
                    ind[0]=i;
                    ind[1]=j;
                     break ;
                    
                    
                 }
               
            }}
         
         return ind;
         
    }
    
}
    

