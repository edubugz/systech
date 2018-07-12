/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestinteger;

import java.util.*;


/**
 *
 * @author Edwin Wanyoike
 */
public class Largestinteger {
  
     public String largest ( String[] a){
         
         int largest=1;
         for (int i=0;i<a.length;i++){
             
             largest= Math.max(largest,Integer.parseInt(a[i]));
             
         }
         return "the largest value in the list "+Arrays.toString(a)+" is "+largest;
     }
    


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enters the integers to check separated by \"-\" :");  
        String enteredInt =sc.nextLine();
        String[] splitInts = enteredInt.split("-",0);
        Largestinteger nums = new Largestinteger ();
        System.out.println(nums.largest(splitInts));
    }
    
}
