/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front22;

/**
 *
 * @author Edwin Wanyoike
 */
public class Front22 {

   public String front22(String str) {
  
  String firstTwo = "";
  if (str.length()<=2){
    firstTwo = str;
  }
  else if (str.length()> 2){
   firstTwo = str.substring (0,2);
  }
  
  return firstTwo+str+firstTwo;
  
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
