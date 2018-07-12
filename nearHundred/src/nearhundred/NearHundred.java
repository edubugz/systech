/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nearhundred;

/**
 *
 * @author Edwin Wanyoike
 */
public class NearHundred {

    public boolean nearHun( int a){
        if (100 - Math.abs(a)<= 10 ||  110 - Math.abs(a)<= 10 || 
                200 - Math.abs(a)<= 10 || 210 - Math.abs(a)<=10 )
        {
            return true;
        }
        return false;
    
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        NearHundred num = new NearHundred ();
        
        System.out.println(num.nearHun(93));
        System.out.println(num.nearHun(-90));
        System.out.println(num.nearHun(89));
    }
    
}
