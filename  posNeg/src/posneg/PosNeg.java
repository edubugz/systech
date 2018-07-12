/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posneg;

/**
 *
 * @author Edwin Wanyoike
 */
public class PosNeg {

    public boolean posNeg(int a, int b, boolean negative) {
        
         if( (a < 0 && b > 0) || (a > 0 && b < 0 ) && negative)
         {
             return true;
         }
         else if ((a<0 && b<0) & !negative ){
             return false;
         }
         else if ((a < 0 && b > 0) || (a > 0 && b < 0 ) && !negative){
        
        return false;
    }
         else return false;
    }
         
                     
    
    
  
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
