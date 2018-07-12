/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front3;

/**
 *
 * @author Edwin Wanyoike
 */
public class Front3 {
    
public String front3(String str) {
  String displayPart="";
  if (str.length()<=3)
  {
     displayPart= str;
  }
  else if (str.length()>3){
   displayPart = str.substring (0,3);
  }
  
  return displayPart+displayPart+displayPart;
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
