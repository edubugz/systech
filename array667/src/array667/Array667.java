/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array667;

/**
 *
 * @author Edwin Wanyoike
 */
public class Array667 {
    int count66=0;
    int count67=0;
    
    public int array667(int[] nums){
        for (int i=0;i<=nums.length-2;i++){
            if(nums[i] == 6 && nums[i+1] == 6){
                count66++;
            }
            else if (nums[i] == 6 && nums[i+1] == 7)
            count67++;
        }
        return count67;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Array667 newar = new Array667();
        int[] ed={6,7,3,4,6,6,7,6,7};
        System.out.println(newar.array667(ed));
    }
    
}
