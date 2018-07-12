/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intmax;

/**
 *
 * @author Edwin Wanyoike
 */
public class IntMax {
      public int intMax (int a, int b, int c){
          if (a > b && a > c){
              return a;              
          }
          
          else if ( b > a && b>c)
          {return b;}
      
      return c;
      }
    public static void main(String[] args) {
       IntMax nums = new IntMax();
       
       System.out.println(nums.intMax(1,2,3));
       System.out.println(nums.intMax(1,3,1));
       System.out.println(nums.intMax(3,2,5));
    }
    
}
