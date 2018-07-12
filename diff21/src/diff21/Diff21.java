
//Given an int n, return the absolute difference between n and 21, except return 
 //double the absolute difference if n is over 21
package diff21;

/**
 *
 * @author Edwin Wanyoike
 */

import java.lang.Math;
public class Diff21 {

   public int diff(int n){
       if (n <=21){
           int diff = Math.abs(21 - n);
           return diff;
       }
       else{
           int diff = Math.abs(2*(n-21));
           return diff;
       }
       
   }
    public static void main(String[] args) {
        // TODO code application logic here
        Diff21 nums = new Diff21 ();
        
        System.out.println(nums.diff(19));
        System.out.println(nums.diff(10));
        System.out.println(nums.diff(21));
    }
    
}
