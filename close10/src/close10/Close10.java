/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package close10;

/**
 *
 * @author Edwin Wanyoike
 */
import java.lang.Math.*;
public class Close10 {

     public int close10(int a, int b){
      if (Math.abs(10 -(a)) > Math.abs(10-(b)))   
      {return b;
      }
      else if (Math.abs(10 -(a)) == Math.abs(10-(b)))
      {
      return 0;
      
      }
      return a;
      
     }

    public static void main(String[] args) {
        // TODO code application logic here
         
        Close10 nums = new Close10 ();
        
        System.out.println (nums.close10(8,13));
        System.out.println (nums.close10(13,8));
        System.out.println (nums.close10(13,7));
       System.out.println( "Chaitanya".substring(2,5));
        
    }
}
    

