/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagsofrice;

import java.util.Scanner;

/**
 *
 * @author Edwin Wanyoike
 */
public class BagsOfRice {
 boolean bagsOfRice(int big,int small,int goal){
     boolean canFit=true;
     double i= goal -(big*5);
         if (small == i){
                 canFit=true;
         }
     
     else{
     canFit= false;
 }
     return canFit;
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of big bags :");  
        int bigBags =sc.nextInt(); 
        System.out.println("Enter the number of small bags :");
        int smallBags =sc.nextInt(); 
        System.out.println("Enter the goal KGs :"); 
        int goal =sc.nextInt();
        BagsOfRice bags = new BagsOfRice();
        
        System.out.println(bags.bagsOfRice(bigBags,smallBags,goal));
        
    }
    
}
