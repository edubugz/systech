/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastrings;

/**
 *
 * @author Edwin Wanyoike
 */
public class JavaStrings {
int count = 0;
      public int check(String s2){
           
           
           for(int i=0;i<=s2.length()-1;i++){
        
            if (s2.substring(i,i+1).contains("xx")){
                count++;
                System.out.println(s2.substring(i,i+1));
            }
        
    }
           return count;
       }
    public static void main(String[] args) {
        String s1= "edwin";
        String s2 = "wanvxxyoikexxabvv";
        
        JavaStrings s3 = new JavaStrings();
        
        System.out.println(s3.check(s2));
     
        
        
       
             
    }
}

