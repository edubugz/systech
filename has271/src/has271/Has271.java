/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package has271;

/**
 *
 * @author Edwin Wanyoike
 */
public class Has271 {
   public String startOz(String str) {

            if (str.length()>=2){
              if (str.substring(0,1).equals("o") && str.substring(1,2).equals("z"))
              {
                return "oz";
              }

              else if (str.substring(0,1).equals("o") || str.substring(1,2).equals("z") )
              {
                if (str.substring(0,1).equals("o"))
                {
                    return "o";
                }
                return "z";
              }

            }
 return str;
   }
    
    public static void main(String[] args) {
       Has271 test1 = new Has271 ();
       
       System.out.println(test1.startOz("oziele"));
       System.out.println(test1.startOz("oiele"));
       System.out.println(test1.startOz("vziele"));
      
     
    }
    
}
