/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysofweek;

/**
 *
 * @author Edwin Wanyoike
 */
public class DaysOfWeek {
        String [] daysOfTheWeekArr={"tuesday","wednesday","thursday","friday","saturday","sunday","monday"};
      
        public static String  getdays()
        {
            return "edwin";
        }
             
        public  String checkDaysOfTheWeek(int numberOfDays)
          {
               String currentDay="";
              if (numberOfDays<=5)
              {
                
                 currentDay+=daysOfTheWeekArr[numberOfDays]; 
              }
              
              else if (numberOfDays%7 > 0)
              {
                  currentDay += daysOfTheWeekArr[numberOfDays%7];
              }
              
              else 
              {
                  currentDay+="tuesday";
              }
              
              return currentDay;
          }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DaysOfWeek daysToCheck = new DaysOfWeek();
      //  for (int i=1;i<=89;i++){
      //  System.out.println(i+" days from tuesday will be on a "+daysToCheck.checkDaysOfTheWeek(i));
    System.out.println(DaysOfWeek.getdays());
    }
    
}
