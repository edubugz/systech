/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max1020;

/**
 *
 * @author Edwin Wanyoike
 */
public class Max1020 {

    public int max1020(int a, int b) {
  
  if (a > b) {
  
    if ( a>=10 && a<=20) {
                
                  return a;
                }
  }
    
    
           
       if ( b>=10 && b<=20) {
                
                  return b;
                }
          
        if (a>=10 && a<=20){
          
          return a;
        }
      
      
    
      
   
   return 0;
}

    public static void main(String[] args) {
        // TODO code application logic here
        
        String name= "edwin";
        
        int count =0;
        
        if ( name.length()>=3){
    //String substr = name.substring(name.length()-2,name.length());
     
   
    String substr1 = name.substring(name.length()-2,name.length());
  String substr2 = name.substring(0,name.length()-2);
  
  
  
   for ( int i=0;i <= name.length()-2;i++){ 
    /*  
      if ( substr2.substring(i,i+1).equals(substr1)){
        System.out.println (substr2.substring(i,i+1));
        count++;
      }
       */
      
      //System.out.println (i);
    //  System.out.print (" "+substr2.substring(i,i+2));
       // System.out.println (name.substring(i,i+2));
        
        
      
    
  }
   
   System.out.println(name.length());
   System.out.println(name.charAt(4));
  /*while (i <= substr2.length()-2){
      
      System.out.println( substr2.substring(i,i+2));
        i++;
      }
  */
    // for (int i=0; i <= n;i++){
     //  substr +=substr;
       
     }
    }
    
}
