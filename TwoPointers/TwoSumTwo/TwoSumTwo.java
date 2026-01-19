package TwoPointers.TwoSumTwo;
import java.util.*;

public class TwoSumTwo {

    public static int[] answer(int[] nums, int target){
        
        // Two Pointers....
        int left = 0;
        int right = nums.length - 1;

        while(left<right){
            int addition = nums[left] + nums[right];
            if(addition == target){
                return new int[]{left + 1, right + 1};
            }

            if(addition < target){
                left++;
            }else{
                right--;
            }           
        }
        return new int[]{};
        

        // HashMap + two pointers..
        // Map<Integer, Integer> numbersMap = new HashMap<>();

        

        // for(int right = 0; right < nums.length; right++){
        //     int complement = target - nums[right];
        //     if(numbersMap.get(left) == complement){   
        //         return new int[]{numbersMap.get(left), right + 1};
        //     }else{
        //         left++;
        //     }
        //     numbersMap.put(nums[right] , right+1);
            
        // }
        


    }

    public static void main(String args[]){
        int[] numsArray = new int[]{2, 5, 6, 8, 10};
        System.out.println(Arrays.toString(answer(numsArray, 100)));
    }
}
