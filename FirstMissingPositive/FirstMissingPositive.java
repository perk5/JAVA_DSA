package FirstMissingPositive;

import java.util.*;

public class FirstMissingPositive {

    public static int fMissingPositive(int[] nums) {

        int contains = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                contains++;
                break;
            }
        }
        if(contains == 0){
            return 1;
        }
        

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || nums[i] > nums.length) {
                nums[i] = 1;
            }
        }
        System.out.println(Arrays.toString(nums));

        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            if (val == nums.length) {
                nums[0] = -Math.abs(nums[0]);
            }else{
                nums[val] = -Math.abs(nums[val]);
            }   
        }
            System.out.println(Arrays.toString(nums));


        for(int i = 1; i < nums.length; i++){
            if(nums[i] > 0){
                return i;
            }
        }

        if(nums[0] > 0){
            return nums.length;
        }
        
        return nums.length + 1;
    }

    public static void main(String args[]) {
        int[] numbers = new int[] {7, 3, 2, 4, 5, 1, 6};
        System.out.println(fMissingPositive(numbers));
    }
}
